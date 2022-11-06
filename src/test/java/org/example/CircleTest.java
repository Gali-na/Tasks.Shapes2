package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private final double pi = 3.14;
    Circle circle;

    @BeforeEach
    void beforeEach() {
        circle = new Circle();
    }

    @Test
    void setCenter() {
        Point pointCentr = new Point(3, 3);
        circle.setCenter(new Point(3, 3));
        assertEquals(pointCentr, circle.getCenter());

    }

    @Test
    void setRadiusPoint_ArgumentMatchesCenter_GetMessages() {
        circle.setCenter(new Point(3, 3));
        String cousoleOutputStream = "";
        String result = "The coordinates of the radius are not transferred correctly, " +
                "they coincide with the center of the circle\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            circle.setRadiusPoint(new Point(3, 3));
            capture.flush();
            cousoleOutputStream = outputStream.toString();
            PrintStream originalOut = System.out;
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(result, cousoleOutputStream);
    }

    @Test
    void setRadiusPoint_ArgumentDoesNotMatchesCenter_GetMessages() {
        circle.setCenter(new Point(3, 3));
        circle.setRadiusPoint(new Point(0, 0));
        assertEquals(new Point(0, 0), circle.getRadiusPoint());
    }

    @Test
    void getPerimetr() {
        Point center = new Point(3, 3);
        Point radiusPoint = new Point(0, 0);
        Circle circle1 = new Circle();
        circle1.setCenter(center);
        circle1.setRadiusPoint(radiusPoint);
        double radius = Math.sqrt(Math.pow(radiusPoint.getX() - center.getX(), 2)
                + Math.pow(radiusPoint.getY() - center.getY(), 2));
        double perimetr = 2 * pi * radius;
        assertEquals((int) perimetr, (int) circle1.getPerimetr());
    }

    @Test
    void getArea() {
        Point center = new Point(3, 3);
        Point radiusPoint = new Point(0, 0);
        Circle circle1 = new Circle();
        circle1.setCenter(center);
        circle1.setRadiusPoint(radiusPoint);
        double radius = Math.sqrt(Math.pow(radiusPoint.getX() - center.getX(), 2)
                + Math.pow(radiusPoint.getY() - center.getY(), 2));
        double area = pi * Math.pow(radius, 2);
        assertEquals((int) area, (int) circle1.getArea());
    }
}