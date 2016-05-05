package ru.shestakov.start;

public class CalcInit {

    private InteractCalc interactCalc;

    public CalcInit(InteractCalc interactCalc) {

        this.interactCalc = interactCalc;

    }

    public static void main (String[] args) {

        Calculator calculator = new Calculator();

        InteractCalc interactCalc = new InteractCalc();

        new CalcInit(interactCalc).init(calculator);

    }

    public void init(Calculator calculator) {

        MenuCalculator menu = new MenuCalculator(this.interactCalc, calculator);
        menu.fillActions();

        int[] ranges = menu.getRanges();
        do {
            menu.show();
            menu.select(this.interactCalc.ask("enter the action:", ranges));
        } while(!"=".equals(this.interactCalc.ask("Exit? (y/n)")));

    }

}
