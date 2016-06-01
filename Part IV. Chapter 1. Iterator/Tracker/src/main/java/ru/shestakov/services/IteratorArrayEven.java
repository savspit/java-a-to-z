package ru.shestakov.services;

import java.util.Iterator;

public class IteratorArrayEven implements Iterator{

    private final int[] values;
    private int index = 0;

    public IteratorArrayEven(final int[] values) {
        this.values = values;
    }

    public boolean hasNext() {
        return (values.length > index);
    }

    public Object next() {
        int result = 0;
        while (hasNext()) {
            if ((index % 2 == 0) && (index != 0)) {
                result = values[index++];
                break;
            } else {
                index++;
            }
        }
        return result;
    }

    public void remove() {

    }

}
