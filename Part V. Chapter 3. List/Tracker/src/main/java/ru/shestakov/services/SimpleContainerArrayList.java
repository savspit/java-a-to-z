package ru.shestakov.services;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleContainerArrayList<E> implements SimpleContainer<E> {

    private final ArrayList<E> values = new ArrayList<E>();
    private int index = 0;

    @Override
    public void add(E o) {
        values.add(o);
    }

    @Override
    public void remove(E o) {
        values.remove(o);
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public E get(int index) {
        return values.get(index);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    public boolean hasNext() {
        return values.size() > index;
    }

    public E next() {
        return values.get(index++);
    }

}
