package ru.shestakov.services;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SimpleContainerArrayListTest {

    @Test
    public void whenAddThenContainerHaveValue() {

        SimpleContainerArrayList<Integer> arrL = new SimpleContainerArrayList<Integer>();
        arrL.add(1);

        assertThat(arrL.get(0), is(1));
    }

    @Test
    public void whenRemoveThenContainerHaveNotValue() {

        SimpleContainerArrayList<Integer> arrL = new SimpleContainerArrayList<Integer>();
        arrL.add(1);
        arrL.remove(1);

        assertThat(arrL.size(), is(0));
    }

}