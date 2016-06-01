package ru.shestakov.start;

import ru.shestakov.services.IteratorArraySimple;

/**
 * Main class
 */
public class StartUI {

    /** The value is used for user`s console input. */
    private Input input;

    /**
     * Initializes a newly created object
     * @param input
     */
    public StartUI(Input input) {
        this.input = input;
    }

    /**
     * Init main loop
     * @param tracker
     */
    public void init(Tracker tracker) {

        MenuTracker menu = new BeautyMenu(this.input, tracker, 10);
        menu.fillActions();

        int[] ranges = menu.getRanges();
        do {
            menu.show();
            menu.select(this.input.ask("select:", ranges));
        } while(!"y".equals(this.input.ask("Exit? (y/n)")));

    }

    /**
     * Main method
     * @param args
     */
     public static void main(String[] args) {

         IteratorArraySimple test = new IteratorArraySimple(new int[] {1, 3, 7});
         while (test.hasNext()) {
             System.out.println(test.next());
         }

        /*Tracker tracker = new Tracker();

        Input input = new ValidateInput();

        new StartUI(input).init(tracker);*/

     }

}