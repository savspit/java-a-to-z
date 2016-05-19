package ru.shestakov.templates;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleGenerator implements Template{

    public String generate(String template, Map<String,String> data) throws SimpleGeneratorException {

        Pattern p = Pattern.compile("\\$\\{(\\w+)\\}");
        Matcher m = p.matcher(template);

        StringBuffer sb = new StringBuffer();

        if (!m.find()) {
            throw new SimpleGeneratorException("No keys in text", new NullPointerException());
        } else if (isKeysInTextLessKeysInData(template, data)) {
            throw new SimpleGeneratorException("Keys in text less keys in data", new NullPointerException());
        } else { m.reset(); }

        while (m.find()) {
            try {
                m.appendReplacement(sb, data.get(m.group(1)));
            } catch (NullPointerException npe) {
                if(data.size()==0) {
                    throw new SimpleGeneratorException("No keys in data", npe);
                } else if (isKeysInDataLessKeysInText(template, data)) {
                    throw new SimpleGeneratorException("Keys in data less keys in text", npe);
                } else {
                    throw npe;
                }
            }
        }

        m.appendTail(sb);

        return sb.toString();
    }

    public boolean isKeysInDataLessKeysInText(String template, Map<String,String> data) {

        Pattern p = Pattern.compile("\\$\\{(\\w+)\\}");
        Matcher m = p.matcher(template);

        StringBuffer sb = new StringBuffer();

        int counter = 0;
        while (m.find()) {
            counter++;
        }

        return counter > data.size();
    }

    public boolean isKeysInTextLessKeysInData(String template, Map<String,String> data) {

        Pattern p = Pattern.compile("\\$\\{(\\w+)\\}");
        Matcher m = p.matcher(template);

        StringBuffer sb = new StringBuffer();

        int counter = 0;
        while (m.find()) {
            counter++;
        }

        return counter < data.size();
    }
}

