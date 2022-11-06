package org.example;

public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(3.0, 1.0);
        Point pointB = new Point(6.0, 3.0);
        Point pointC = new Point(8.0, 1.0);
        Triangle triangle = new Triangle();
        triangle.setTopA(pointA);
        triangle.setTopB(pointB);
        triangle.setTopC(pointC);

        System.out.println(triangle.getPerimetr());
        System.out.println(triangle.getArea());
        System.out.println(triangle.toString());
        System.out.println();
        Point pointARectangle = new Point(1, 1);
        Point pointBRectangle = new Point(1, 3);
        Point pointCRectangle = new Point(6, 3);
        Point pointDRectangle = new Point(6, 1);
        Rectangle rectangle = new Rectangle();
        rectangle.setTopA(pointARectangle);
        rectangle.setTopB(pointBRectangle);
        rectangle.setTopC(pointCRectangle);
        rectangle.setTopD(pointDRectangle);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getPerimetr());
        System.out.println(rectangle.getArea());
        System.out.println("");

        Circle circle = new Circle();
        Point pointACircle = new Point(0, 0);
        Point pointBCircle = new Point(1, 4);
        circle.setCenter(pointACircle);
        circle.setRadiusPoint(pointBCircle);
        System.out.println(circle.toString());
        System.out.println(circle.getArea());

        System.out.println();
        Board board = new Board();
        board.addShpape(triangle);
        board.addShpape(rectangle);
        board.addShpape(circle);
        board.addShpape(triangle);
        board.showInformationShapeInBoard();
        System.out.println(board.deleteShape());
        System.out.println();
        System.out.println();
        System.out.println(board.showInformationShapeInBoard());
    }
}
