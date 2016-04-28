package ru.shestakov.models;

public class FilterByName implements Filter {

    final private String name;

    public FilterByName(String name) {
        this.name = name;
    }

    public boolean check(Item item) {
        if (item != null) {
            return item.getName().contains(name);
        } else {
            return false;
        }
    }

}
