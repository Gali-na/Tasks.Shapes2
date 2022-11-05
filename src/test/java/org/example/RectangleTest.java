package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    static Rectangle rectangle;

    @BeforeEach
    void beforeEach() {
        rectangle = new Rectangle();
      /*  Point topA = new Point();
        Point topB = new Point();
        Point topC= new Point();
        Point topD = new Point();*/
    }

    @Test
    void getTopA() {
        Point topA = new Point(3, 0);
        rectangle.setTopA(topA);
        assertEquals(topA, rectangle.getTopA());
    }

    @Test
    void setTopA_ArgumentIsNull_GetMessages() {
        Point topA = null;
        String cousoleOutputStream = "";
        String result = "Coordinates entered incorrectly, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            rectangle.setTopA(topA);
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
    void setTopA_ArgumentIsNotNull_Setting_Argument() {
        Point topA = new Point(3, 4);
        rectangle.setTopA(topA);
        assertEquals(topA, rectangle.getTopA());
    }

    @Test
    void getTopB() {
        Point topA = new Point(3, 4);
        Point topB = new Point(4, 3);
        rectangle.setTopA(topA);
        rectangle.setTopB(topB);
        assertEquals(topB, rectangle.getTopB());
    }

    @Test
    void setTopB_ArgumentIsNull_GetMessages() {
        Point topA = new Point(3, 4);
        Point topB = null;
        rectangle.setTopA(topA);
        String cousoleOutputStream = "";
        String result = "Coordinates entered incorrectly, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            rectangle.setTopB(topB);
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
    void setTopB_AargumentIsNotNullThePeakIsDifferentFromOtherPeaks_GetMessages() {
        Point topA = new Point(-4, 4);
        Point topB = new Point(4, 4);
        rectangle.setTopA(topA);
        rectangle.setTopB(topB);
        assertEquals(topB, rectangle.getTopB());

    }

    @Test
    void setTopB_AargumentIsTheSameOtherPeaks_GetMessages() {
        Point topA = new Point(-4, 4);
        Point topB = new Point(-4, 4);
        rectangle.setTopA(topA);
        rectangle.setTopB(topB);
        String cousoleOutputStream = "";
        String result = "Coordinates entered incorrectly, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            rectangle.setTopB(topB);
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
    void getTopC() {
        Point topA = new Point(-4, 4);
        Point topB = new Point(4, 4);
        Point topC= new Point(4,3);
        rectangle.setTopA(topA);
        rectangle.setTopB(topB);
        rectangle.setTopC(topC);
        assertEquals(topC,rectangle.getTopC());
    }

    @Test
    void setTopC_ArgumentIsNull_GetMessages() {
        Point topA = new Point(-4, 4);
        Point topB = new Point(4, 4);
        Point topC= null;
        rectangle.setTopA(topA);
        rectangle.setTopB(topB);
        String cousoleOutputStream = "";
        String result = "Coordinates entered incorrectly, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            rectangle.setTopC(topC);
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
    void setTopC_AargumentIsTheSameOtherPeaks_GetMessages() {
        Point topA = new Point(-4, 4);
        Point topB = new Point(4, 4);
        Point topC= new Point(4,4);
        rectangle.setTopA(topA);
        rectangle.setTopB(topB);
        String cousoleOutputStream = "";
        String result = "Coordinates entered incorrectly, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            rectangle.setTopC(topC);
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
    void setTopC_AargumentIsNotNullThePeakIsDifferentFromOtherPeaks_GetMessages() {
        Point topA = new Point(-4, 4);
        Point topB = new Point(4, 4);
        Point topC= new Point(4,4);
        rectangle.setTopA(topA);
        rectangle.setTopB(topB);
        rectangle.setTopC(topC);
        assertEquals(topB, rectangle.getTopB());
    }


    @Test
    void getTopD() {
        Point topA = new Point(-4, 4);
        Point topB = new Point(4, 4);
        Point topC= new Point(4,-4);
        Point topD = new Point(-4,-4);
        rectangle.setTopA(topA);
        rectangle.setTopB(topB);
        rectangle.setTopC(topC);
        rectangle.setTopD(topD);
        assertEquals(topD, rectangle.getTopD());
    }

    @Test
    void setTopD_AargumentIsNotNullThePeakIsDifferentFromOtherPeaks_GetMessages() {
        Point topA = new Point(-4, 4);
        Point topB = new Point(4, 4);
        Point topC= new Point(4,-4);
        Point topD = new Point(-4,-4);
        rectangle.setTopA(topA);
        rectangle.setTopB(topB);
        rectangle.setTopC(topC);
        rectangle.setTopD(topD);
        assertEquals(topD, rectangle.getTopD());
    }
    @Test
    void setTopD_ArgumentIsNull_GetMessages() {
        Point topA = new Point(-4, 4);
        Point topB = new Point(4, 4);
        Point topC= new Point(4,-4);
        Point topD = null;
        rectangle.setTopA(topA);
        rectangle.setTopB(topB);
        rectangle.setTopC(topC);
        rectangle.setTopD(topD);
        String cousoleOutputStream = "";
        String result = "Coordinates entered incorrectly, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            rectangle.setTopD(topD);
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
    void setTopD_AargumentIsTheSameOtherPeaks_GetMessages() {
        Point topA = new Point(-4, 4);
        Point topB = new Point(4, 4);
        Point topC= new Point(4,-4);
        Point topD = new Point(4,-4);;
        rectangle.setTopA(topA);
        rectangle.setTopB(topB);
        rectangle.setTopC(topC);
        rectangle.setTopD(topD);
        String cousoleOutputStream = "";
        String result = "Coordinates entered incorrectly, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            rectangle.setTopD(topD);
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
    void getPerimetr() {

    }

    @Test
    void getArea() {
    }
}