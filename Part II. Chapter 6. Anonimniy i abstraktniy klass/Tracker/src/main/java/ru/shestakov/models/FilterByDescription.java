package ru.shestakov.models;

public class FilterByDescription implements Filter {

    final private String desc;

    public FilterByDescription(String desc) {
        this.desc = desc;
    }

    public boolean check(Item item) {
        boolean result = false;
        if (item != null) { result = item.getDescription().contains(desc); }
        return result;
    }
}
