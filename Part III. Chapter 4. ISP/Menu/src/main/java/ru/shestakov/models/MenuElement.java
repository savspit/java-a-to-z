package ru.shestakov.models;

public abstract class MenuElement implements Element {

    public String name;
    public boolean Subsidiary;
    public Element parent;

    public void execute() {

    }
}
