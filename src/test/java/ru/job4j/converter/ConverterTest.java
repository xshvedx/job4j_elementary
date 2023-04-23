package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        float in = 140;
        float expected = 1.57f;
        float out = Converter.rubleToEuro(in);
        float eps = 1.5730337f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void rubleToDollar() {
        float in = 200;
        float expected = 2.46f;
        float out = Converter.rubleToDollar(in);
        float eps = 2.4691358f;
        Assert.assertEquals(expected, out, eps);
    }
}