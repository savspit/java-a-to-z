package ru.shestakov.templates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleGenerator implements Template {

    public String generate(String template, Object[] data) {

        Pattern p = Pattern.compile("\\$\\{(\\w+)\\}");
        Matcher m = p.matcher(template);

        StringBuffer sb = new StringBuffer();
        int level = 0;
        while (m.find()) {
            try {
                m.appendReplacement(sb, String.valueOf(data[level++]));
            } catch (ArrayIndexOutOfBoundsException aie) {
                return null;
            }
        }

        m.appendTail(sb);

        return sb.toString();
    }
}
