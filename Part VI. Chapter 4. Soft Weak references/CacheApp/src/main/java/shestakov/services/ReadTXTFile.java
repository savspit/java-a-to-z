package shestakov.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.SoftReference;

public class ReadTXTFile {
    public SoftReference<String> getContent(String key) throws IOException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(key))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        }
        return new SoftReference<>(builder.toString());
    }
}
