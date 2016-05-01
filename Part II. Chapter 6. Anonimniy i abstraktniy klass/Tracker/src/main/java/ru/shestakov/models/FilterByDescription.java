package ru.shestakov.models;

public class FilterByDescription implements Filter {

    final private String desc;

    public FilterByDescription(String desc) {
        this.desc = desc;
    }

    public boolean check(Item item) {
        if (item != null) { return item.getDescription().contains(desc); } else { return false; }
    }
}
