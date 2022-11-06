package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    Point point;

    @BeforeEach
    void beforeEach() {
        point = new Point();
    }

    @Test
    void setX_ArgumentIsOutsideDouble_SetUpArgument() {
        double max = Double.MAX_VALUE;
        String cousoleOutputStream = "";
        String result = "Data sent incorrectly, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            point.setX(max);
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
    void setX_ArgumentIsNormal_SetUpArgument() {
        point.setX(9.0);
        assertEquals(9.0, point.getX());
    }

    @Test
    void setY_ArgumentIsNormal_SetUpArgument() {
        point.setY(9.0);
        assertEquals(9.0, point.getY());
    }

    @Test
    void setY_ArgumentIsOutsideDouble_SetUpArgument() {
        double max = Double.MAX_VALUE;
        String cousoleOutputStream = "";
        String result = "Data sent incorrectly, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            point.setY(max);
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
    void getX() {
        point.setX(9.0);
        assertEquals(9.0, point.getX());
    }

    @Test
    void getY() {
        point.setY(9.0);
        assertEquals(9.0, point.getY());
    }
}