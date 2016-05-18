package ru.shestakov.templates;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TemplateTest {

    @Test
    public void whenTakeTestWithDataShouldReplaceParamsToData() {

        // assign
        SimpleGenerator template = new SimpleGenerator();
        String text = "Hello, ${name}.";
        String[] data = new String[] {"Petr"};
        String checked = "Hello, Petr.";

        // act
        String result = template.generate(text, data);

        // action
        Assert.assertThat(result, is(checked));
    }

    @Test
    public void whenTakeTestWithSmallDataShouldReturnNull() {

        // assign
        SimpleGenerator template = new SimpleGenerator();
        String text = "Hello, ${name}. Hello, ${name}.";
        String[] data = new String[] {"Petr"};
        String checked = null;

        // act
        String result = template.generate(text, data);

        // action
        Assert.assertThat(result, is(checked));
    }
}