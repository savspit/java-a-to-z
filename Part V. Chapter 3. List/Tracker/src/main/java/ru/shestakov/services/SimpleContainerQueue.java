package ru.shestakov.services;

import java.util.Iterator;
import java.util.LinkedList;

public class SimpleContainerQueue<E> extends SimpleContainerLinkedList<E> {

    private final LinkedList<E> values = new LinkedList<E>();
    private int index = 0;

    public E poll() {
        E e = values.get(0);
        values.remove(0);
        return e;
    }

    public E peek() {
        return values.get(0);
    }

    @Override
    public void add(E e) {
        values.add(e);
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
