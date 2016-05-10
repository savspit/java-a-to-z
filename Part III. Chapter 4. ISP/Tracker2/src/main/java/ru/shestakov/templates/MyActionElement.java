package ru.shestakov.templates;

import ru.shestakov.start.Input;
import ru.shestakov.start.Tracker;

public abstract class MyActionElement implements MyAction{

    public String name;
    public boolean subsidiary;
    public MyAction parent;

    public MyActionElement(String name) {
        this.name = name;
    }

    public MyActionElement(String name, boolean subsidiary, MyAction parent) {
        this.name = name;
        this.subsidiary = subsidiary;
        this.parent = parent;
    }

    public abstract int key();

    public abstract void execute(Input input, Tracker tracker);

    public String info() {
        return String.format("%s. %s", this.key(), this.name);
    }

}
