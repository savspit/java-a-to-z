package ru.shestakov.start;

import ru.shestakov.models.*;

public class StartUI {
    private Input input;

    public StartUI(Input input) {
        this.input = input;
    }

    public void init(Tracker tracker) {

        String result = input.ask("Please, enter the action (1-add, 2-update, 3-delete, 4-add comment, 5-find by name, 6-find by description, 7-find by date, 8-print all, 9-exit): ");

        if (result.equals("1")) {
            new StartUI(input).addItem(tracker);
        }

        if (result.equals("2")) {
            new StartUI(input).updateItem(tracker);
        }

        if (result.equals("3")) {
            new StartUI(input).deleteItem(tracker);
        }

        if (result.equals("4")) {
            new StartUI(input).addComment(tracker);
        }

        if (result.equals("5")) {
            new StartUI(input).findByName(tracker);
        }

        if (result.equals("6")) {
            new StartUI(input).findByDescription(tracker);
        }

        if (result.equals("7")) {
            new StartUI(input).findByCreate(tracker);
        }

        if (result.equals("8")) {
            new StartUI(input).printAll(tracker);
        }

        if (!result.equals("9")) {
            init(tracker);
        }

    }

    public void addItem(Tracker tracker) {

        String name = input.ask("Please, enter the new task`s name to add: ");
        String desc = input.ask("Please, enter the new task`s description to add: ");
        String create = input.ask("Please, enter the new task`s date to add: ");
        tracker.add(new Task(name, desc, Long.parseLong(create)));

     }

    public void updateItem(Tracker tracker) {

        String id = input.ask("Please, enter the task`s id to update: ");

        if (tracker.findById(id) != null) {

            String name = input.ask("Please, enter the new name: ");
            String desc = input.ask("Please, enter the new description: ");
            String create = input.ask("Please, enter the new date: ");

            Task task = new Task(name, desc, Long.parseLong(create));
            task.setId(id);
            tracker.update(task);

        } else {
            System.out.println("This id does not exists");
        }

    }

    public void deleteItem(Tracker tracker) {

        String id = input.ask("Please, enter the task`s id to delete: ");

        if (tracker.findById(id) != null) {

            Task task = new Task("", "", Long.parseLong("7698"));
            task.setId(id);
            tracker.delete(task);

        } else {
            System.out.println("This id does not exists");
        }

    }

    public void addComment(Tracker tracker) {

        String id = input.ask("Please, enter the task`s id to add comment: ");

        if (tracker.findById(id) != null) {

            String inputComment = input.ask("Please, enter the new comment to add to " + id + " task: ");

            Comment comment = new Comment(id, inputComment);
            tracker.addComment(comment);

        } else {
            System.out.println("This id does not exists");
        }

    }

    public void findByName(Tracker tracker) {

        String name = input.ask("Please, enter the task`s name to find: ");

        Filter filter = new FilterByName(name);

        Item[] result = tracker.findBy(filter);

     }

    public void findByDescription(Tracker tracker) {

        String desc = input.ask("Please, enter the task`s description to find: ");

        Filter filter = new FilterByDescription(desc);

        Item[] result = tracker.findBy(filter);

    }

    public void findByCreate(Tracker tracker) {

        String create = input.ask("Please, enter the task`s date to find: ");

        Filter filter = new FilterByCreate(Long.parseLong(create));

        Item[] result = tracker.findBy(filter);

     }

    public void printAll(Tracker tracker) {

        String result = input.ask("Print all? (y/n): ");

        if (result.equals("y")) {

            for (Item item : tracker.getAll()) {
                if (item != null) {
                    System.out.println(item.getId() + " " + item.getName());
                }
            }

        }
    }

    public static void main(String[] args) {

        Tracker tracker = new Tracker();

        Input input = new ConsoleInput();

        new StartUI(input).init(tracker);

     }

}