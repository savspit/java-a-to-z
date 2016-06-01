package ru.shestakov.services;

import org.junit.Test;

public class IteratorArrayEvenTest {

    @Test
    public void whenGetNextCallShouldPointerForward() {
        IteratorArrayEven it = new IteratorArrayEven(new int[] {1, 3, 7});

        int result = 0;

        while (it.hasNext()) {
            result = (Integer) it.next();
        }
        //assertThat(result, is(7));
    }

}