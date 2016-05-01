package ru.shestakov.templates;

import ru.shestakov.start.*;

public abstract class BaseAction implements UserAction {

    public String name;

    public BaseAction(String name) {
        this.name = name;
    }

    public abstract int key();

    public abstract void execute(Input input, Tracker tracker);

    public String info() {
        return String.format("%s. %s", this.key(), this.name);
    }

}
