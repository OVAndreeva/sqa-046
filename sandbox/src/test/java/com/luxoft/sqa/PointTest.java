package com.luxoft.sqa;

import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void testAreaDistance() {
        Point p1 = new Point(30.0, 50.0);
        Point p2 = new Point(50.0, 80.0);
        assert p1.distance(p2) == 36.05551275463989;
    }

    @Test
    public void testAreaDistance0() {
        Point p1 = new Point(30.0, 50.0);
        Point p2 = new Point(30.0, 50.0);
        assert p1.distance(p2) == 0.0;
    }
}
