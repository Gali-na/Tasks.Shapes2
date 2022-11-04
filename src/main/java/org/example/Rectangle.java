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
        this.topA = topA;
    }

    public Point getTopB() {
        return topB;
    }

    public void setTopB(Point topB) {
        if (this.topA.getY() == topB.getY()) {
            this.topB = topB;
        } else {
            System.out.println("Coordinates entered incorrectly, please try again");
        }
    }

    public Point getTopC() {
        return topC;
    }

    public void setTopC(Point topC) {
        if (this.topB.getX() == topC.getX()) {
            this.topC = topC;
        } else {
            System.out.println("Coordinates entered incorrectly, please try again");
        }

    }

    public Point getTopD() {
        return topD;
    }

    public void setTopD(Point topD) {
        if (this.topC.getY() == topD.getY()) {
            this.topD = topD;
        } else {
            System.out.println("Coordinates entered incorrectly, please try again");
        }
    }

    private double sideAB() {
       return  Math.sqrt( Math.pow((topB.getX()-topA.getX()),2)
               +Math.pow((topB.getY()-topA.getY()),2));
    }

    private  double sideBC() {
        return Math.sqrt(Math.pow(topC.getX()-topB.getX(),2)
                        + (Math.pow((topC.getY()-topB.getY()),2)));
    }

    private double sideCD() {
        return  Math.sqrt(
                (Math.pow(topD.getX()-topC.getX(),2))
                        +(Math.pow((topD.getY()-topC.getY()),2)));
    }

    private double sideCA() {
        return  Math.sqrt(
                Math.pow((topC.getX()-topA.getX()),2)+
                        Math.pow((topC.getY()- topA.getY()),2));
    }


    @Override
    double getPerimetr() {
        return sideAB()+sideBC()+sideCD()+sideCA();
    }

    @Override
    double getArea() {
        return sideAB()*sideBC();
    }
}
