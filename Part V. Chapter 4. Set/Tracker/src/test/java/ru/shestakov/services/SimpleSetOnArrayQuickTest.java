package ru.shestakov.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSetOnArrayQuickTest {

    @Test
    public void compareSpeed() {

        SimpleSetOnArray<Integer> sa = new SimpleSetOnArray<Integer>();

        long time1 = System.nanoTime();
        int count=0;
        while (count < 10000) {
            sa.add(count++);
        }
        long time2 = System.nanoTime();
        System.out.println("simple: " + (time2-time1));


        SimpleSetOnArrayQuick<Integer> saq = new SimpleSetOnArrayQuick<Integer>();

        long timeq1 = System.nanoTime();
        int countq=0;
        while (countq < 10000) {
            saq.add(countq++);
        }
        long timeq2 = System.nanoTime();
        System.out.println("quick: " + (timeq2-timeq1));

    }

}