package org.example;

import java.util.Scanner;

public class Board {
    private Shape[] shapes;

    public Board() {
        this.shapes = new Shape[4];
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public void addShpape(Shape shape) {
        for (int i = 0; i < this.shapes.length; i++) {
            if (shapes[i] == null) {
                shapes[i] = shape;
                return;
            }

        }
        System.out.println("The board already contains 4 pieces "
                + "before adding a new piece delete one of the existing ones");
    }

    private String informationAboutShapeInBoard() {
        StringBuilder rezult = new StringBuilder();
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                rezult.append(shapes[i].toString() + "number shape" + i + "\r\n");
            }
        }
        if (this == null) {
            rezult.append("The board does not contain pieces");
        }
        return rezult.toString();
    }

    private int figureNumberSelection() {
        System.out.println(informationAboutShapeInBoard());
        System.out.println("Enter the number of the figure you want to see");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        in.close();
        if (num < 0 || num > 3) {
            System.out.println("The number to enter is not correct, select a number from 0 to 3");
        }
        return num;
    }

    public String deleteShape() {
        String rezult = "";
        int numberForDelet = figureNumberSelection();
        if (numberForDelet <= 3 && numberForDelet >= 0) {
            this.shapes[numberForDelet] = null;
            rezult = "Figure removed";
        } else {
            rezult = "The number to delete the element is not correct";
        }
        return rezult;
    }

    public String showInformationShapeInBoard() {
        StringBuilder information = new StringBuilder();
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                information.append(shapes[i].toString());
                information.append("\r\n");
            }
        }
        return information.toString();
    }
}
