package ru.shestakov.templates;

import ru.shestakov.start.Input;
import ru.shestakov.start.Tracker;

public interface MyAction {

    int key();

    void execute(Input input, Tracker tracker);

    String info();

}
