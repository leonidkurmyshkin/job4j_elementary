package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        double out = p1.distance(p2);
        Assert.assertEquals(2, out, 0.01);
    }

    @Test
    public void when1010to100100then127() {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(100, 100);
        double out = p1.distance(p2);
        Assert.assertEquals(127.28, out, 0.01);
    }

    @Test
    public void when0neg10to010then20() {
        Point p1 = new Point(0, -10);
        Point p2 = new Point(0, 10);
        double out = p1.distance(p2);
        Assert.assertEquals(20, out, 0.01);
    }

    @Test
    public void when0neg1010to0neg10neg10then20() {
        Point p1 = new Point(0, -10, 10);
        Point p2 = new Point(0, -10, -10);
        Assert.assertEquals(20, p1.distance3d(p2), 0.01);
    }
}