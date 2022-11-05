package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    static Triangle triangle;

    @BeforeEach
    void beforeEach() {
        triangle = new Triangle();
    }

    @Test
    void setTopAargumentIsNotNull() {
        Point point = new Point(-3, 4);
        triangle.setTopA(point);
        assertEquals(triangle.getTopA(), point);
    }

    @Test
    void setTopAargumentIsNull() {
        Point point = null;
        String cousoleOutputStream = "";
        String result = "Vertex passed incorrectly, try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            triangle.setTopA(point);
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
    void setTopBAargumentIsNotNullThePeakIsDifferentFromOtherPeaks() {
        Point point = new Point(0, 3);
        triangle.setTopA(point);
        assertEquals(triangle.getTopA(), point);
    }

    @Test
    void setTopBAargumentIsNotNullTheTopBSameAsTopA() {
        Point point = new Point(-3, 4);
        triangle.setTopA(point);
        triangle.setTopB(point);
        String cousoleOutputStream = "";
        String result = "Vertex passed incorrectly, try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            triangle.setTopB(point);
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
    void setTopBAargumentIsNull() {
        Point point = null;
        triangle.setTopB(point);
        String cousoleOutputStream = "";
        String result = "Vertex passed incorrectly, try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            triangle.setTopB(point);
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
    void setTopCAargumentIsNull() {
        Point point = null;
        triangle.setTopB(point);
        String cousoleOutputStream = "";
        String result = "Vertex passed incorrectly, try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            triangle.setTopC(point);
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
    void setTopCAargumentIsNotNullThePeakIsDifferentFromOtherPeaks() {
        Point pointA = new Point(-3, 0);
        Point pointB = new Point(0, 3);
        Point pointC = new Point(4, 0);
        triangle.setTopA(pointA);
        triangle.setTopB(pointB);
        triangle.setTopC(pointC);
        assertEquals(triangle.getTopC(), pointC);
    }

    @Test
    void setTopCAargumentIsNotNullTheTopCSameAsTopA() {
        Point pointA = new Point(-3, 0);
        Point pointB = new Point(0, 3);
        Point pointC = new Point(-3, 0);
        triangle.setTopA(pointA);
        triangle.setTopB(pointB);
        String cousoleOutputStream = "";
        String result = "Vertex passed incorrectly, try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            triangle.setTopC(pointC);
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
    void setTopCAargumentIsNotNullTheTopCSameAsTopB() {
        Point pointA = new Point(-3, 0);
        Point pointB = new Point(0, 3);
        Point pointC = new Point(0, 3);
        triangle.setTopA(pointA);
        triangle.setTopB(pointB);
        String cousoleOutputStream = "";
        String result = "Vertex passed incorrectly, try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            triangle.setTopC(pointC);
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
    void getTopA() {
        Point pointA = new Point(-3, 0);
        triangle.setTopA(pointA);
        assertEquals(pointA, triangle.getTopA());

    }

    @Test
    void getTopB() {
        Point pointB = new Point(-3, 0);
        triangle.setTopB(pointB);
        assertEquals(pointB, triangle.getTopB());

    }

    @Test
    void getTopC() {
        Point pointA = new Point(-3, 0);
        Point pointB = new Point(0, 3);
        Point pointC = new Point(3, 0);
        triangle.setTopA(pointA);
        triangle.setTopB(pointB);
        triangle.setTopC(pointC);
        assertEquals(pointC, triangle.getTopC());
    }

    @Test
    void getPerimetrIfAllSidesAreAntO() {
        Point pointA = new Point(-3, 0);
        Point pointB = new Point(0, 3);
        Point pointC = new Point(3, 0);
        triangle.setTopA(pointA);
        triangle.setTopB(pointB);
        triangle.setTopC(pointC);
        double sidAB = Math.sqrt((Math.pow((pointB.getX() - pointA.getX()), 2)) +
                (Math.pow((pointB.getY() - pointA.getY()), 2)));
        double sidBC = Math.sqrt((Math.pow((pointC.getX() - pointB.getX()), 2)) +
                (Math.pow((pointC.getY() - pointB.getY()), 2)));
        double sidCA = Math.sqrt((Math.pow((pointC.getX() - pointA.getX()), 2)) +
                (Math.pow((pointC.getY() - pointA.getY()), 2)));
        double perimetr = sidAB + sidBC + sidCA;
        assertEquals((int) perimetr, (int) (triangle.getPerimetr()));
    }

    @Test
    void getArea() {
        Point pointA = new Point(-3, 0);
        Point pointB = new Point(0, 3);
        Point pointC = new Point(3, 0);
        triangle.setTopA(pointA);
        triangle.setTopB(pointB);
        triangle.setTopC(pointC);
        double sidAB = Math.sqrt((Math.pow((pointB.getX() - pointA.getX()), 2)) +
                (Math.pow((pointB.getY() - pointA.getY()), 2)));
        double sidBC = Math.sqrt((Math.pow((pointC.getX() - pointB.getX()), 2)) +
                (Math.pow((pointC.getY() - pointB.getY()), 2)));
        double sidCA = Math.sqrt((Math.pow((pointC.getX() - pointA.getX()), 2)) +
                (Math.pow((pointC.getY() - pointA.getY()), 2)));
        double semiPerimeter = (sidAB + sidBC + sidCA) / 2;
        double аrea = Math.sqrt(semiPerimeter * ((semiPerimeter - sidAB) *
                (semiPerimeter - sidBC) * (semiPerimeter - sidCA)));
         assertEquals((int)аrea,(int)triangle.getArea());
    }
}