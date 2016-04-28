package ru.shestakov.models;

public class FilterByCreate implements Filter {

    final private long create;

    public FilterByCreate(long create) {
        this.create = create;
    }

    public boolean check(Item item) {
        if (item != null) {
            return item.getCreate() == create;
        } else {
            return false;
        }
    }
}
