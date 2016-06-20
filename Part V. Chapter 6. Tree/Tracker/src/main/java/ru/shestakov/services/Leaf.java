package ru.shestakov.services;

import java.util.LinkedList;
import java.util.List;

public class Leaf<E> {

    private List<Leaf<E>> root = new LinkedList<>();
    private Leaf<E> parent = null;
    private E e;
    private int size;

    public Leaf(E e) {
        this(e, null);
    }

    public Leaf(E e, Leaf<E> parent) {
        this.e = e;
        this.parent = parent;
    }

    public List<E> getChildren() {
        List<E> children = new LinkedList<E>();
        for (Leaf leaf : this.root) {
            if (leaf.parent == this.parent) {
                children.add((E) leaf.e);
            }
        }
        return children;
    }

    public void addChild (Leaf<E> child) {
        child.parent = this.parent;
        this.root.add(child);
        size++;
    }

    public int size() {
        return size;
    }

}
