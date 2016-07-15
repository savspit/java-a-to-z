package shestakov.services;

import java.util.Scanner;

public class ConsoleInput implements Input{
    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.print(question);
        KeyMaskChecker kms = new KeyMaskChecker();
        while (true) {
            try {
                String nextLine = scanner.nextLine();
                if(!"e".equals(nextLine) && !kms.keyIsCorrect(nextLine)) {
                    throw new InputException("key have wrong format. please enter validate data again\n");
                }
                return nextLine;
            } catch (InputException ie) {
                System.out.print(String.format("%s %s", ie.getMessage(), question));
            }
        }
    }
}
