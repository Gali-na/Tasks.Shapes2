package org.example;

public class Rectangle extends Shape {
    private Point topA;
    private Point topB;
    private Point topC;
    private Point topD;

    public Point getTopA() {
        return topA;
    }

    public void setTopA(Point topA) {
        if (topA != null) {
            this.topA = topA;
        } else {
            System.out.println("Coordinates entered incorrectly, please try again");
        }

    }

    public Point getTopB() {

        return topB;
    }

    public void setTopB(Point topB) {
        if ((this.topA.equals(topB) != true) && topB != null) {
            this.topB = topB;
        } else {
            System.out.println("Coordinates entered incorrectly, please try again");
        }
    }

    public Point getTopC() {

        return topC;
    }

    public void setTopC(Point topC) {
        if (topC != null && (topC.equals(this.topA) != true) && (topC.equals(this.topB) != true)) {
            this.topC = topC;
        } else {
            System.out.println("Coordinates entered incorrectly, please try again");
        }

    }

    public Point getTopD() {
        return topD;
    }

    public void setTopD(Point topD) {
        if (topD != null && (topD.equals(this.topA) != true)
                && (topD.equals(this.topB) != true)
                && (topD.equals(this.topC) != true)) {
            this.topD = topD;
        } else {
            System.out.println("Coordinates entered incorrectly, please try again");
        }
    }

    private double sideAB() {
        return Math.sqrt(Math.pow((topB.getX() - topA.getX()), 2)
                + Math.pow((topB.getY() - topA.getY()), 2));
    }

    private double sideBC() {
        return Math.sqrt(Math.pow(topC.getX() - topB.getX(), 2)
                + (Math.pow((topC.getY() - topB.getY()), 2)));
    }

    private double sideCD() {
        return Math.sqrt(
                (Math.pow(topD.getX() - topC.getX(), 2))
                        + (Math.pow((topD.getY() - topC.getY()), 2)));
    }

    private double sideDA() {
        return Math.sqrt(
                Math.pow((topD.getX() - topA.getX()), 2) +
                        Math.pow((topD.getY() - topA.getY()), 2));
    }


    @Override
    double getPerimetr() {
        return sideAB() + sideBC() + sideCD() + sideDA();
    }

    @Override
    double getArea() {
        return sideAB() * sideBC();
    }

    @Override
    public String toString() {
        StringBuilder informatiom = new StringBuilder();
        informatiom.append("Rectangle ").append(" Perimetr =")
                .append(this.getPerimetr())
                .append(" Area = ").append(this.getArea());
        return informatiom.toString();
    }
}
