package ru.shestakov.start;

/**
 * Init StubInput class
 */
public class StubInput implements Input {

    /** The value is used for answers storage. */
    private String[] answers;
    /** The value is used for position in answers storage. */
    private int position = 0;

    /**
     * Initializes a newly created object
     * @param answers
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * Returns the <code>String</code> value at the
     * specified index.
     */
    public String ask(String question) {
        return answers[position++];
    }

    /**
     * Returns the <code>String</code> value at the
     * specified index.
     */
    public long ask(String question, boolean check) {
        return -1;
    }

    /**
     * Returns the <code>String</code> value at the
     * specified index.
     */
    public int ask(String question, int[] range) {
        throw new UnsupportedOperationException("Unsupported operation");
    }
}
