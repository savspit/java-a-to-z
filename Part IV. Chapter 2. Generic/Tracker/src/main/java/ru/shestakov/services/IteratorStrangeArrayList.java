package ru.shestakov.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorStrangeArrayList implements IteratorStrange{

    public List<Integer> convert(List<List<Integer>> it) {

        List<Integer> result = new ArrayList<Integer>();

        Iterator<List<Integer>> iterBig = it.iterator();
        while(iterBig.hasNext()) {
            Iterator<Integer> iterSmall = iterBig.next().iterator();
            while (iterSmall.hasNext()) {
                result.add(iterSmall.next());
            }
        }
        return result;
    }

    public Iterator[] convert(Iterator it) {
        return null;
    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {

    }


}
