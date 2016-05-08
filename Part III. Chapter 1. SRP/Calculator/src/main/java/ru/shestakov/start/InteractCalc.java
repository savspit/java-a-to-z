package ru.shestakov.start;

import java.util.*;

public class InteractCalc{
    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    public double ask(String question, boolean check) {
        System.out.print(question);
        try {
            return Long.parseLong(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Incorrect value. Please, enter again.");
        }
        return -1;
    }

    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for(int value : range) {
            if(value == key) {
                exist = true;
                break;
            }
        }
        if (exist) { return key; } else { throw new MenuOutException("Out of menu range."); }
    }

}
