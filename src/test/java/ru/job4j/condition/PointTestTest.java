package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTestTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to55then5dot38() {
        double expected = 5.385164807134504;
        int x1 = 3;
        int y1 = 0;
        int x2 = 5;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to07then6dot40() {
        double expected = 6.4031242374328485;
        int x1 = 4;
        int y1 = 2;
        int x2 = 0;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when26to06then2() {
        double expected = 2;
        int x1 = 2;
        int y1 = 6;
        int x2 = 0;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}