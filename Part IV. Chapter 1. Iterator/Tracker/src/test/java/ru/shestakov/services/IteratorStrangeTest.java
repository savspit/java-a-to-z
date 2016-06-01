package ru.shestakov.services;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class IteratorStrangeTest {

    @Test
    public void whenConvertedThenConverted() {

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(3);
        list2.add(4);

        List<List<Integer>> listBig = new ArrayList<List<Integer>>();
        listBig.add(list1);
        listBig.add(list2);

        IteratorStrangeArrayList iteratorStrange= new IteratorStrangeArrayList();
        List<Integer> listSmall = iteratorStrange.convert(listBig);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        assertArrayEquals(expected.toArray(), listSmall.toArray());

    }

}