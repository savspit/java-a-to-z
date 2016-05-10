package ru.shestakov.start;

import ru.shestakov.templates.MyAction;

/**
 * Created by user on 08.05.2016.
 */
public class BeautyMenu extends MenuTracker{

    /**
     * Initializes a newly created menu action
     *
     * @param input
     * @param tracker
     * @param size
     */
    public BeautyMenu(Input input, Tracker tracker, int size) {
        super(input, tracker, size);
    }

    @Override
    public void showItem(MyAction action) {
        System.out.println("-=" + action.info());
    }
}
