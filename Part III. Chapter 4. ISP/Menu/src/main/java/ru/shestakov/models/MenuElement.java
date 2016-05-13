package ru.shestakov.models;

public class MenuElement implements Element {

    public long id;
    public long parentId;
    public String name;

    public MenuElement(String name) {
        this.name = name;
    }

    public MenuElement(String name, long parentId) {
        this.name = name;
        this.parentId = parentId;
    }

    public long getId() {
        return this.id;
    }

    public long getParentId() {
        return this.parentId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void print() {
        System.out.println(this.id + " " + this.parentId + " " + this.name);
    }
}
