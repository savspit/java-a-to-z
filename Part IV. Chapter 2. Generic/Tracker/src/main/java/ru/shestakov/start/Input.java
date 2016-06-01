package ru.shestakov.start;

/**
 * Init Input interface
 */
public interface Input extends SimpleInput, InputRange {

    /**
     * Method`s instruction for subclasses
     * @param question
     * @return
     */
    String ask(String question);

}