package shestakov.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.SoftReference;

public class ReadTXTFile {
    private String path;

    public void setPath(String dir, String fileName) {
        this.path = dir + fileName;
    }

    public SoftReference<String> getContent() throws IOException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(this.path))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        }
        SoftReference<String> softValue = new SoftReference<>(builder.toString());
        return softValue;
    }
}
