package ru.shestakov.services;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IteratorArraySimpleTest {

    @Test
    public void whenGetNextCallShouldPointerForward() {
        IteratorArraySimple it = new IteratorArraySimple(new int[] {1, 3, 5});

        int result = 0;

        while (it.hasNext()) {
            result = (Integer) it.next();
        }
        assertThat(result, is(5));
    }
}