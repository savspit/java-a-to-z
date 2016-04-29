package ru.shestakov.start;

import ru.shestakov.models.*;

class UpdateItem implements UserAction {
    public int key() {
        return 1;
    }

    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Please, enter the task`s id: ");

        if(tracker.findById(id) != null) {

            String name = input.ask("Please, enter the task`s name: ");
            String desc = input.ask("Please, enter the task`s desc: ");
            String create = input.ask("Please, enter the task`s date: ");
            Task task = new Task(name, desc, create);
            task.setId(id);
            tracker.update(task);

        } else if(id.equals("b")) {
            //nothing to do here
        } else {
            System.out.println("ID does not exists. Enter the task`s id or 'b' to go back");
            execute(input,tracker);
        }


    }

    public String info() {
        return String.format("%s. %s", this.key(), "Edit the new item.");
    }
}

public class MenuTracker {

    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[10];

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions() {
        this.actions[0] = this.new AddItem();
        this.actions[1] = new UpdateItem();
        this.actions[2] = new DeleteItem();
        this.actions[3] = new AddCommentToItem();
        this.actions[4] = new FindItemByName();
        this.actions[5] = new FindItemByDescription();
        this.actions[6] = new FindItemByCreate();
        this.actions[7] = new MenuTracker.ShowItems();
    }

    public int[] getRanges() {
        int[] ranges = new int[this.actions.length];
        for (int index=0; index<this.actions.length; index++) {
            ranges[index] = index;
        }
        return ranges;
    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private class AddItem implements UserAction {
        public int key() {
            return 0;
        }

        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task`s name: ");
            String desc = input.ask("Please, enter the task`s desc: ");
            String create = input.ask("Please, enter the task`s date: ");
            tracker.add(new Task(name, desc, create));
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Add the new item.");
        }

    }

    private class DeleteItem implements UserAction {
        public int key() {
            return 2;
        }

        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task`s id: ");

            if(tracker.findById(id) != null) {
                Task task = new Task();
                task.setId(id);
                tracker.delete(task);

            } else if(id.equals("b")) {
                //nothing to do here
            } else {
                System.out.println("ID does not exists. Enter the task`s id or 'b' to go back");
                execute(input,tracker);
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Delete the item.");
        }

    }

    private class AddCommentToItem implements UserAction {
        public int key() {
            return 3;
        }

        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the task`s id: ");

            if (tracker.findById(id) != null) {

                String inputComment = input.ask("Please, enter the new comment to add to " + id + " task: ");

                Comment comment = new Comment(id, inputComment);
                tracker.addComment(comment);

            } else if(id.equals("b")) {
                //nothing to do here
            } else {
                System.out.println("ID does not exists. Enter the task`s id or 'b' to go back");
                execute(input,tracker);
            }

        }

        public String info() {
            return String.format("%s. %s", this.key(), "Add comment to the item.");
        }

    }

    private class FindItemByName implements UserAction {
        public int key() {
            return 4;
        }

        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task`s name to find: ");

            Filter filter = new FilterByName(name);

            Item[] result = tracker.findBy(filter);

            if (result.length != 0) {
                for (Item item : result) {
                    if (item != null) {
                        System.out.println(item.getId());
                    }
                }
            } else if(name.equals("b")) {
                //nothing to do here
            } else {
                System.out.println("No matches. Enter the task`s name or 'b' to go back");
                execute(input,tracker);
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Find item by name.");
        }
    }

    private class FindItemByDescription implements UserAction {
        public int key() {
            return 5;
        }

        public void execute(Input input, Tracker tracker) {
            String desc = input.ask("Please, enter the task`s description to find: ");

            Filter filter = new FilterByDescription(desc);

            Item[] result = tracker.findBy(filter);

            if (result.length != 0) {
                for (Item item : result) {
                    if (item != null) {
                        System.out.println(item.getId());
                    }
                }
            } else if(desc.equals("b")) {
                //nothing to do here
            } else {
                System.out.println("No matches. Enter the task`s description or 'b' to go back");
                execute(input,tracker);
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Find item by description.");
        }
    }

    private class FindItemByCreate implements UserAction {
        public int key() {
            return 6;
        }

        public void execute(Input input, Tracker tracker) {
            String create = input.ask("Please, enter the task`s date to find: ");

            Filter filter = new FilterByCreate(Long.parseLong(create));

            Item[] result = tracker.findBy(filter);

            if (result.length != 0) {
                for (Item item : result) {
                    if (item != null) {
                        System.out.println(item.getId());
                    }
                }
            } else if(create.equals("b")) {
                //nothing to do here
            } else {
                System.out.println("No matches. Enter the task`s date or 'b' to go back");
                execute(input,tracker);
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Find item by date.");
        }

    }

    public static class ShowItems implements UserAction {
        public int key() {
            return 7;
        }

        public void execute(Input input, Tracker tracker) {

            Item[] result = tracker.getAll();

            if (result.length != 0) {
                for (Item item : result) {
                    if (item != null) {
                        System.out.println(String.format("%s. %s", item.getId(), item.getName()));
                    }
                }
            } else {
                System.out.println("Tracker is empty.");
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }

    }

}

