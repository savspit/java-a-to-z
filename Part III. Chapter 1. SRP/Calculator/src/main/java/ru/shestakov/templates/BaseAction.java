package ru.shestakov.templates;

import ru.shestakov.start.Calculator;
import ru.shestakov.start.InteractCalc;

public abstract class BaseAction {

    public String name;

    public BaseAction(String name) {
        this.name = name;
    }

    public abstract int key();

    public abstract void execute(InteractCalc interactCalc, Calculator calculator);

    public String info() {
        return String.format("%s. %s", this.key(), this.name);
    }

}
