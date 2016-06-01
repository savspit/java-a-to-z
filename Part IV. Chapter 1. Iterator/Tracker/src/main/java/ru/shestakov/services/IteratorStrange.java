package ru.shestakov.services;

import java.util.Iterator;

public interface IteratorStrange<Integer> extends Iterator<Integer> {

    Iterator<Integer> convert(Iterator<Iterator<Integer>> it);

}
