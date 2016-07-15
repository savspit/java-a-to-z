package shestakov.models;

import shestakov.services.ReadTXTFile;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.HashMap;

public class CacheManager {
    private HashMap<String,SoftReference<String>> cache;
    private String dir;

    public void setDir(String dir) {
        this.dir = dir;
    }

    public SoftReference<String> getValue(String key) {
        return this.cache.get(key);
    }

    public void checkKey(String key) throws IOException {
        if (this.cache == null) { cache = new HashMap<>(); }
        if (!containsKey(key)) {
            loadDataFromFile(key);
        }
    }

    public void loadDataFromFile(String key) throws IOException {
        ReadTXTFile reader = new ReadTXTFile();
        reader.setPath(this.dir, key);
        this.cache.put(key, reader.getContent());
    }

    public boolean containsKey(String key) {
        return this.cache.containsKey(key);
    }

    public void showValue(String key) {
        System.out.println(getValue(key).get());
    }

    public void remove(String key) {
        this.cache.remove(key);
    }

}
