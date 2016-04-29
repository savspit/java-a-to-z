package ru.shestakov.start;

public class StartUI {
    //private int[] ranges = new int[] {1,2,3,4};
    private Input input;

    public StartUI(Input input) {
        this.input = input;
    }

    public void init(Tracker tracker) {

        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();
        int[] ranges = menu.getRanges();
        do {
            menu.show();
            menu.select(input.ask("select:", ranges));
        } while(!"y".equals(this.input.ask("Exit? (y/n)")));

    }

     public static void main(String[] args) {

        Tracker tracker = new Tracker();

        Input input = new ValidateInput();

        new StartUI(input).init(tracker);

     }

}