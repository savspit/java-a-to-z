package ru.shestakov.start;

import ru.shestakov.templates.InputException;
import java.util.Scanner;

public class ConsoleInput implements Input{

    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.print(question);
        while (true) {
            try {
                String nextLine = scanner.nextLine();
                if(nextLine.length() != 2) {
                    throw new InputException("Wrong length. ");
                } else {
                    Long.parseLong(nextLine);
                }
                return nextLine;
            } catch (NumberFormatException nfe) {
                System.out.print("Incorrect value. " + question);
            } catch (InputException ie) {
                System.out.print(ie.getMessage() + question);
            }
        }
    }
}
