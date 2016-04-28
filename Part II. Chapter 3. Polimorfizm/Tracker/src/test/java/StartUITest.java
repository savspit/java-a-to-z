import org.junit.*;
import ru.shestakov.models.*;
import ru.shestakov.start.*;

public class StartUITest {

    /*
    public static void main(String[] args) {
       Input input = new StubInput(new String[] {"create stub task"});
        new StartUI(input).init();
    }*/

    @Test
    public void testAddItem() throws Exception {

        Tracker tracker = new Tracker();

        String name = "task1";
        String desc = "desc1";
        String create = "3724";

        Input input = new StubInput(new String[]{name, desc, create});
        new StartUI(input).addItem(tracker);

        for (Item item : tracker.getAll()) {
            if (item != null) {
                Assert.assertEquals(item.getName(), name);
            }
        }

    }

    @Test
    public void testUpdateItem() throws Exception {

        Tracker tracker = new Tracker();

        // add first item

        String name1 = "task1";
        String desc1 = "desc1";
        String create1 = "3724";

        Input input1 = new StubInput(new String[]{name1, desc1, create1});
        new StartUI(input1).addItem(tracker);

        // add second item

        String name2 = "task1";
        String desc2 = "desc1";
        String create2 = "3724";

        Input input2 = new StubInput(new String[]{name2, desc2, create2});
        new StartUI(input2).addItem(tracker);

        // get first item id

        String id = "";

        Filter filter = new FilterByName(name1);
        Item[] result = tracker.findBy(filter);
        for (Item item : result) {
            if(item.getName().equals(name1)) {
                id = item.getId();
            }
        }

        // update first item

        String name3 = "updated task";
        String desc3 = "updated desc";
        String create3 = "46754";

        Input input3 = new StubInput(new String[]{id, name3, desc3, create3});
        new StartUI(input3).updateItem(tracker);

        Item foundedItem = tracker.findByIdTest(id);

        Assert.assertEquals(name3, foundedItem.getName());

    }

    @Test
    public void testDeleteItem() throws Exception {

        Tracker tracker = new Tracker();

        // add first item

        String name1 = "task1";
        String desc1 = "desc1";
        String create1 = "3724";

        Input input1 = new StubInput(new String[]{name1, desc1, create1});
        new StartUI(input1).addItem(tracker);

        // add second item

        String name2 = "task1";
        String desc2 = "desc1";
        String create2 = "3724";

        Input input2 = new StubInput(new String[]{name2, desc2, create2});
        new StartUI(input2).addItem(tracker);

        // get first item id

        String id = "";

        Filter filter = new FilterByName(name1);
        Item[] result = tracker.findBy(filter);
        for (Item item : result) {
            if (item.getName().equals(name1)) {
                id = item.getId();
            }
        }

        // delete first item

        Input input3 = new StubInput(new String[]{id});
        new StartUI(input3).deleteItem(tracker);

        Assert.assertNull(tracker.findByIdTest(id));
    }

    @Test
    public void testAddComment() throws Exception {

        Tracker tracker = new Tracker();

        // add item

        String name = "task1";
        String desc = "desc1";
        String create = "3724";

        Input input1 = new StubInput(new String[]{name, desc, create});
        new StartUI(input1).addItem(tracker);

        for (Item item : tracker.getAll()) {
            if (item != null) {
                Assert.assertEquals(item.getName(), name);
            }
        }

        // get item id

        String id = "";

        Filter filter = new FilterByName(name);
        Item[] result = tracker.findBy(filter);
        for (Item item : result) {
            if (item.getName().equals(name)) {
                id = item.getId();
            }
        }

        // add comment to item

        String comment = "new comment";

        Input input2 = new StubInput(new String[]{id, comment});
        new StartUI(input2).addComment(tracker);

        for (Comment nextComment : tracker.findByIdTest(id).getComments()) {
            if(nextComment != null) {
                Assert.assertEquals(nextComment.getText(), comment);
                break;
            }
        }
    }

    @Test
    public void testFindByName() throws Exception {

        Tracker tracker = new Tracker();

        // add item

        String name = "task1";
        String desc = "desc1";
        String create = "3724";

        Input input1 = new StubInput(new String[]{name, desc, create});
        new StartUI(input1).addItem(tracker);

        for (Item item : tracker.getAll()) {
            if (item != null) {
                Assert.assertEquals(item.getName(), name);
            }
        }

        // get item id

        String id = "";

        Filter filter = new FilterByName(name);
        Item[] result = tracker.findBy(filter);
        for (Item item : result) {
            if (item.getName().equals(name)) {
                id = item.getId();
            }
        }

    }

}
