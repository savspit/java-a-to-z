package ru.shestakov.services;

import java.util.Iterator;
import java.util.LinkedList;

public class SimpleContainerStack<E> extends SimpleContainerLinkedList<E> {

    private final LinkedList<E> values = new LinkedList<E>();
    private int index = 0;

    public E pop() {
        E e = values.get(values.size()-1);
        values.remove(values.size()-1);
        return e;
    }

    public E peek() {
        return values.get(values.size()-1);
    }

    public void push(E e) {
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
