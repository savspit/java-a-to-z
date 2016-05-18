package ru.shestakov.templates;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TemplateTest {

    @Test
    public void whenTakeTestWithDataShouldReplaceParamsToData() {

        // assign
        SimpleGenerator template = new SimpleGenerator();
        String text = "Hello, ${name}.";
        Map<String,String> data = new HashMap<String, String>();
        data.put("name", "Petr");
        String checked = "Hello, Petr.";

        // act
        String result = template.generate(text, data);

        // action
        Assert.assertThat(result, is(checked));
    }

    @Test
    public void whenTakeTestWithNoKeysInDataShouldReturnError() {

        // assign
        SimpleGenerator template = new SimpleGenerator();
        String text = "Hello, ${name}. Hello, ${name}.";
        Map<String,String> data = new HashMap<String, String>();

        // act
        String result = template.generate(text, data);

        // action
        String checked = "e001";
        Assert.assertThat(result, is(checked));

    }

    @Test
    public void whenTakeTestWithNoKeysInTextShouldReturnError() {

        // assign
        SimpleGenerator template = new SimpleGenerator();
        String text = "Hello!.";
        Map<String,String> data = new HashMap<String, String>();
        data.put("namet", "Petr");

        // act
        String result = template.generate(text, data);

        // action
        String checked = "e002";
        Assert.assertThat(result, is(checked));

    }

    @Test
    public void whenTakeTestWithKeysInDataLessKeysInTextShouldReturnError() {

        // assign
        SimpleGenerator template = new SimpleGenerator();
        String text = "Hello, ${name}, ${surname}.";
        Map<String,String> data = new HashMap<String, String>();
        data.put("name", "Petr");

        // act
        String result = template.generate(text, data);

        // action
        String checked = "e003";
        Assert.assertThat(result, is(checked));

    }

    @Test
    public void whenTakeTestWithKeysInTextLessKeysInDataShouldReturnError() {

        // assign
        SimpleGenerator template = new SimpleGenerator();
        String text = "Hello, ${name}.";
        Map<String,String> data = new HashMap<String, String>();
        data.put("name", "Petr");
        data.put("surname", "Parsentev");

        // act
        String result = template.generate(text, data);

        // action
        String checked = "e004";
        Assert.assertThat(result, is(checked));

    }
}