package ru.shestakov.start;

import ru.shestakov.services.ReadXMLFile;

import java.io.File;
import java.io.IOException;

public class OrderBook {

    long startTime;
    boolean isParsed;

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setParsed(boolean parsed) {
        isParsed = parsed;
    }

    public void parse(File xmlFile) throws IOException {

        setStartTime(System.currentTimeMillis());

        ReadXMLFile sb = new ReadXMLFile();
        sb.setXmlFile(xmlFile);
        sb.parse();
        sb.convert();
        sb.print();

        setParsed(true);

    }

    public void showParseTime() {
        System.out.println("parsing time is: " + (System.currentTimeMillis()-this.startTime) + " ms");
    }

    public boolean isParsed() {
        return this.isParsed;
    }

}
