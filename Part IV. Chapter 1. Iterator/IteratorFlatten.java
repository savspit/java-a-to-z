package ru.shestakov.services;

import java.util.*;

public class IteratorFlatten implements Iterator {

    Iterator<Integer> ii;
    Integer[] i;
    int indexI = 0;
    int index = 0;

    public IteratorFlatten(Iterator<Iterator<Integer>> it) {
        convert(it);
    }

    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {

        while(it.hasNext()) {
            convertn(it.next());
        }
        return this.ii;
    }

    public void convertn(Iterator<Integer> its) {

        while (its.hasNext()) {
            i[indexI++] = its.next();
        }
    }

    public boolean hasNext() {
        return i.length > index;
    }

    public Integer next() {
        return i[index++];
    }

    public void remove() {

    }

}
