package ru.shestakov.services;

import java.util.*;

public class IteratorFlatten implements Iterator {

    Iterator<Integer> ii;
    Iterator<Iterator<Integer>> it;
    Iterator<Integer> itInt;

    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        this.it = it;
        return this.ii;
    }

    public boolean hasNext() {
        if(itInt == null || !itInt.hasNext()) {
            if(!it.hasNext() && !itInt.hasNext()) {
                return false;
            }
            itInt = it.next();
        }
        return itInt.hasNext();
    }

    public Object next() {
        return itInt.next();
    }

    public void remove() {

    }

}
