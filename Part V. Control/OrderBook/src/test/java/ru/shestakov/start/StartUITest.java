package ru.shestakov.start;

import org.junit.Test;
import ru.shestakov.services.ConsoleInput;
import ru.shestakov.services.Input;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenExecute10TimesShouldBeAround6000Millis() throws IOException {

        OrderBook orderBook = new OrderBook();

        long counterMillis = 0;
        for (int i=0; i<10; i++) {
            long time = System.currentTimeMillis();
            orderBook.parse(new File("C:\\orders.xml"));
            orderBook.showParseTime();
            counterMillis = counterMillis + (System.currentTimeMillis()-time);
        }
        System.out.println("~ " + (counterMillis/10) + " ms");

    }


}