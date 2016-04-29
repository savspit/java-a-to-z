package ru.shestakov.models;

public class FilterByCreate implements Filter {

    final private long create;

    public FilterByCreate(long create) {
        this.create = create;
    }

    public boolean check(Item item) {
        boolean result = false;
        if (item != null) { result = new Long(item.getCreate()).equals(create); }
        return result;
    }
}
