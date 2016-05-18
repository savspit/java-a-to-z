package ru.shestakov.templates;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleGenerator implements Template{

    public String generate(String template, Map<String,String> data) {

        String error = getError(template, data);
        if(error != null) { return error; }

        Pattern p = Pattern.compile("\\$\\{(\\w+)\\}");
        Matcher m = p.matcher(template);

        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, data.get(m.group(1)));
        }

        m.appendTail(sb);

        return sb.toString();
    }

    public String getError(String template, Map<String,String> data) {
        if(isEmptyDataError(data)) { return "e001"; }
        if(isEmptyTextError(template)) { return "e002"; }
        if(isKeysInDataLessKeysInText(template, data)) { return "e003"; }
        if(isKeysInTextLessKeysInData(template, data)) { return "e004"; }
        return null;
    }

    public boolean isEmptyDataError(Map<String,String> data) {
        return data.size() == 0;
    }

    public boolean isEmptyTextError(String template) {
        Pattern p = Pattern.compile("\\$\\{(\\w+)\\}");
        Matcher m = p.matcher(template);

        StringBuffer sb = new StringBuffer();

        return !(m.find());
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
