package org.example;

public class Triangle extends Shape {
    private Point topA;
    private Point topB;
    private Point topC;

    public Point getTopA() {
        return topA;
    }

    public void setTopA(Point topA) {
        this.topA = topA;
    }

    public Point getTopB() {
        return topB;
    }

    public void setTopB(Point topB) {
        this.topB = topB;
    }

    public Point getTopC() {
        return topC;
    }

    public void setTopC(Point topC) {
        this.topC = topC;
    }

    private double sideAB() {
        return Math.sqrt((Math.pow((topB.getX() - topA.getX()), 2)) +
                (Math.pow((topB.getY() - topA.getY()), 2)));
    }

    private double sideAC() {
        return Math.sqrt((Math.pow((topC.getX() - topA.getX()), 2)) +
                (Math.pow((topC.getY() - topA.getY()), 2)));
    }

    private double sideBC() {
        return Math.sqrt((Math.pow((topB.getX() - topC.getX()), 2)) +
                (Math.pow((topB.getY() - topC.getY()), 2)));
    }

    private double semiPerimeter() {
        return (sideAB() + sideAC() + sideBC()) / 2;
    }

    @Override
    double getPerimetr() {
        return sideAB() + sideAC() + sideBC();
    }

    @Override
    double getArea() {
        return Math.sqrt(semiPerimeter() * ((semiPerimeter() - sideAC()) *
                (semiPerimeter() - sideAB()) * (semiPerimeter() - sideBC())));
    }


    @Override
    public String toString() {
        StringBuilder information = new StringBuilder();
        information.append("Triangle ").append("Perimetr = ")
                .append(this.getPerimetr()).append("Area = ").append(this.getArea());
        return information.toString();
    }
}
