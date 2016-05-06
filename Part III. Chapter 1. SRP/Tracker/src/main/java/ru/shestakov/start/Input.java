package ru.shestakov.start;

/**
 * Init Input interface
 */
public interface Input {

    /**
     * Method`s instruction for subclasses
     * @param question
     * @return
     */
    String ask(String question);

    /**
     * Method`s instruction for subclasses
     * @param question
     * @return
     */
    long ask(String question, boolean check);

    /**
     * Method`s instruction for subclasses
     * @param question
     * @param range
     * @return
     */
    int ask(String  question, int[] range);

}
