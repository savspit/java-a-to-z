import org.junit.Test;
import ru.shestakov.models.Item;
import ru.shestakov.start.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StartUIOverHeapTest {

    private static List arr = new ArrayList();
    private static boolean test = true;
    private static String input;
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        while (test) {
            System.out.println("type 'y' to add BIG object or any key to exit");
            input = in.readLine();
            if ((input != null)) {
                if (input.startsWith("y")) {
                    addObject();
                } else {
                    test = false;
                }
            }
        }
    }

    private static void addObject() {
        arr.add(new byte[1024 * 1024 * 100]);
    }

}
