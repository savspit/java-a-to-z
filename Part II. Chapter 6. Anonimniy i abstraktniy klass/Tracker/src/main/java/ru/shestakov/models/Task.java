package ru.shestakov.models;

public class Task extends Item {

    public Task() {

    }

    public Task(String name, String desc, String create) {
        this.name = name;
        this.description = desc;

        try {
            this.create = Long.parseLong(create);
        } catch (NumberFormatException nfe) {
            System.out.println("Incorrect value of task`s date. Please, enter correct date again.");
        }
    }

    public String calculatePrice() {
        return "100%";
    }

}