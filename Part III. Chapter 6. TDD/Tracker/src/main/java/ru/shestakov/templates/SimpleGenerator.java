package ru.shestakov.templates;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleGenerator implements Template{

    public String generate(String template, Map<String,String> data) throws SimpleGeneratorException {

        Pattern p = Pattern.compile("\\$\\{(\\w+)\\}");
        Matcher m = p.matcher(template);

        StringBuffer sb = new StringBuffer();

        if (data.size() == 0) {
            throw new SimpleGeneratorException("No keys in data");
        }

        boolean found = false;
        int counter = 0;
        while (m.find()) {
            try {
                String value = data.get(m.group(1));
                if(value == null) {
                    throw new SimpleGeneratorException("Keys in data less keys in text");
                }
                m.appendReplacement(sb, value);
            } catch (NullPointerException npe) {
                throw new SimpleGeneratorException("NullPointerException", npe);
            }
            found = true;
            counter++;
        }
        if (!found) {
            throw new SimpleGeneratorException("No keys in text");
        }
        if (counter != data.size()) {
            throw new SimpleGeneratorException("Keys in text less keys in data");
        }

        m.appendTail(sb);

        return sb.toString();
    }
}

