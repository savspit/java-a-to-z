import org.junit.Assert;
import org.junit.Test;
import ru.shestakov.models.Comment;
import ru.shestakov.models.Filter;
import ru.shestakov.models.FilterByName;
import ru.shestakov.models.Item;
import ru.shestakov.start.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StartUIPerfomanceTest {

    @Test
    public void testAddDeleteItem() throws Exception {

        Tracker tracker = new Tracker();

        String action1 = "0";
        String action2 = "2";
        String yes = "y";

        String name = "task";
        String desc = "desc";
        String create = "3724";

        // add 1

        for (int i=0; i<100000; i++) {
            Input input = new StubInput(new String[]{action1, name, desc, create, yes});
            new StartUI(input).init(tracker);
            System.out.println("ADDED");
        }

        // delete 1

        for (Item item : tracker.getAll()) {
            if (item != null) {
                Input input3 = new StubInput(new String[]{action2, item.getId(), yes});
                new StartUI(input3).init(tracker);
                System.out.println("DELETED");
            }
        }

        // add 2

        for (int i=0; i<100000; i++) {
            Input input = new StubInput(new String[]{action1, name, desc, create, yes});
            new StartUI(input).init(tracker);
            System.out.println("ADDED");
        }

        // delete 2

        for (Item item : tracker.getAll()) {
            if (item != null) {
                Input input3 = new StubInput(new String[]{action2, item.getId(), yes});
                new StartUI(input3).init(tracker);
                System.out.println("DELETED");
            }
        }

    }

}
