package ru.shestakov.start;

import ru.shestakov.templates.*;

public class MenuCalculator {

    private InteractCalc interactCalc;
    private Calculator calculator;
    private BaseAction[] actions = new BaseAction[10];
    private int position = 0;

    public MenuCalculator(InteractCalc interactCalc, Calculator calculator) {
        this.interactCalc = interactCalc;
        this.calculator = calculator;
    }

    public void fillActions() {
        fillAction(new EnterTheNumber());
        fillAction(new Addiction());
        fillAction(new Substraction());
        fillAction(new Multiplication());
        fillAction(new Division());
        fillAction(new AddToMemory());
        fillAction(new GetFromMemory());
    }

    public void fillAction(BaseAction action) {
        this.actions[position++] = action;
    }

    public void addAction(BaseAction action) {
        this.actions[position++] = action;
    }

    public int[] getRanges() {
        int[] ranges = new int[this.actions.length];
        for (int index=0; index<this.actions.length; index++) {
            ranges[index] = index;
        }
        return ranges;
    }

    public void select(int key) {
        this.actions[key].execute(this.interactCalc, this.calculator);
    }

    public void show() {
        for (BaseAction action : this.actions) {
            if (action != null) { this.showItem(action); }
        }
    }

    public void showItem(BaseAction action) {
        System.out.println(action.info());
    }

    private class EnterTheNumber extends BaseAction {

        EnterTheNumber() {
            super("Enter the number.");
        };

        public int key() {
            return 0;
        }

        public void execute(InteractCalc interactCalc, Calculator calculator) {
            double value = interactCalc.ask("Please, enter the number: ", true);

            calculator.addTheNumber(value);
        }

    }

    private class Addiction extends BaseAction {

        Addiction() {
            super("Addiction ( + ).");
        };

        public int key() {
            return 1;
        }

        public void execute(InteractCalc interactCalc, Calculator calculator) {
            double value = interactCalc.ask("Please, enter the number: ", true);

            calculator.addiction(value);
        }

    }

    private class Substraction extends BaseAction {

        Substraction() {
            super("Substraction ( - ).");
        };

        public int key() {
            return 2;
        }

        public void execute(InteractCalc interactCalc, Calculator calculator) {
            double value = interactCalc.ask("Please, enter the number: ", true);

            calculator.substraction(value);
        }

    }

    private class Multiplication extends BaseAction {

        Multiplication() {
            super("Multiplication ( * ).");
        };

        public int key() {
            return 3;
        }

        public void execute(InteractCalc interactCalc, Calculator calculator) {
            double value = interactCalc.ask("Please, enter the number: ", true);

            calculator.multiplication(value);
        }

    }

    private class Division extends BaseAction {

        Division() {
            super("Division ( / ).");
        };

        public int key() {
            return 4;
        }

        public void execute(InteractCalc interactCalc, Calculator calculator) {
            double value = interactCalc.ask("Please, enter the number: ", true);

            calculator.division(value);
        }

    }

    private class AddToMemory extends BaseAction {

        AddToMemory() {
            super("Add to memory ( M+ ).");
        };

        public int key() {
            return 5;
        }

        public void execute(InteractCalc interactCalc, Calculator calculator) {
            calculator.setMemoryConst();
        }

    }

    private class GetFromMemory extends BaseAction {

        GetFromMemory() {
            super("Get from memory ( M- ).");
        };

        public int key() {
            return 6;
        }

        public void execute(InteractCalc interactCalc, Calculator calculator) {
            calculator.setTempMemoryConst();
        }

    }

}

