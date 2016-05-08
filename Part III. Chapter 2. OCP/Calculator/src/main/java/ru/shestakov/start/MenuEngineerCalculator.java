package ru.shestakov.start;

import ru.shestakov.templates.BaseAction;

public class MenuEngineerCalculator extends MenuCalculator {

    public MenuEngineerCalculator(InteractCalc interactCalc, Calculator calculator) {
        super(interactCalc, calculator);
    }

    @Override
    public void fillActions() {
        fillAction(new Sinus());
        fillAction(new Cosinus());
        fillAction(new Tangens());
    }

    @Override
    public void showItem(BaseAction action) {
        System.out.println(action.info());
    }

    private class Sinus extends BaseAction {

        Sinus() {
            super("Sinus (sin).");
        };

        public int key() {
            return 0;
        }

        public void execute(InteractCalc interactCalc, Calculator calculator) {
            double value = interactCalc.ask("Please, enter the number: ", true);

            calculator.sinus(value);
        }

    }

    private class Cosinus extends BaseAction {

        Cosinus() {
            super("Cosinus (cos).");
        };

        public int key() {
            return 1;
        }

        public void execute(InteractCalc interactCalc, Calculator calculator) {
            double value = interactCalc.ask("Please, enter the number: ", true);

            calculator.cosinus(value);
        }

    }

    private class Tangens extends BaseAction {

        Tangens() {
            super("Tangens (tan).");
        };

        public int key() {
            return 2;
        }

        public void execute(InteractCalc interactCalc, Calculator calculator) {
            double value = interactCalc.ask("Please, enter the number: ", true);

            calculator.tangens(value);
        }

    }

}
