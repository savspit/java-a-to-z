package ru.shestakov.services;

import java.util.*;

public class IteratorFlatten implements Iterator {

    Iterator<Integer> ii;
    ArrayList<Integer> i = new ArrayList<Integer>();
    Iterator itr = null;

    public IteratorFlatten(Iterator<Iterator<Integer>> it) {
        convert(it);
        itr = i.iterator();
    }

    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {

        while(it.hasNext()) {
            convertNext(it.next());
        }
        return this.ii;
    }

    public void convertNext(Iterator<Integer> its) {

        while (its.hasNext()) {
            i.add(its.next());
        }
    }

    public boolean hasNext() {
        return itr.hasNext();
    }

    public Object next() {
        return itr.next();
    }

    public void remove() {

    }

}
