package ru.shestakov.models;

public class FilterByName implements Filter {

    final private String name;

    public FilterByName(String name) {
        this.name = name;
    }

    public boolean check(Item item) {
        boolean result = false;
        if (item != null) {result = item.getName().contains(name); }
        return result;
    }

}
