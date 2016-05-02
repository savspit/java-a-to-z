package ru.shestakov.models;

public class FilterByDescription implements Filter {

    final private String desc;

    public FilterByDescription(String desc) {
        this.desc = desc;
    }

    public boolean check(Item item) {
        return (item != null) && (item.getDescription().contains(desc));
    }
}
