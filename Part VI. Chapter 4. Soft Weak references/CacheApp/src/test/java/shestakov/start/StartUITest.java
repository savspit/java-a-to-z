package shestakov.start;

import org.junit.Assert;
import org.junit.Test;
import shestakov.models.CacheManager;

import java.io.IOException;

public class StartUITest {

    @Test
    public void whenGCisDoneShouldKeepValue() throws IOException, InterruptedException {
        CacheManager cm = new CacheManager();
        String dir = "C:\\Users\\user\\Documents\\memory\\";
        String key = "UseSerialGC.txt";
        cm.setDir(dir);
        cm.checkKey(key);
        System.gc();
        Thread.sleep(1000);
        Assert.assertNotNull(cm.getValue(key));
    }

}