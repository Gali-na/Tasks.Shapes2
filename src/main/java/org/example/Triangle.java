package org.example;

import java.util.Objects;

public class Triangle extends Shape {
    private Point topA;
    private Point topB;
    private Point topC;

    public Triangle() {
    }

    public Point getTopA() {
        return topA;
    }

    public Point getTopB() {
        return topB;
    }

    public Point getTopC() {
        return topC;
    }

    public void setTopA(Point topA) {
        if (topA != null) {
            this.topA = topA;
        } else {
            System.out.println("Vertex passed incorrectly, try again");
        }
    }

    public void setTopB(Point topB) {
        if ((topB != null) && (topB.equals(topA) != true)) {
            this.topB = topB;
        }
        else {
            System.out.println("Vertex passed incorrectly, try again");
        }
    }

    public void setTopC(Point topC) {
        if ((topC != null) && (topB.equals(topC) != true) && (topA.equals(topC)!=true)) {
            this.topC = topC;
        }else {
            System.out.println("Vertex passed incorrectly, try again");
        }
    }

    private double sideAB() {
        if((topB!= null) && topA!=null) {
            return Math.sqrt((Math.pow((topB.getX() - topA.getX()), 2)) +
                    (Math.pow((topB.getY() - topA.getY()), 2)));
        }return 0.0;
    }

    private double sideAC() {
        if(topC!=null && topA!=null) {
            return Math.sqrt((Math.pow((topC.getX() - topA.getX()), 2)) +
                    (Math.pow((topC.getY() - topA.getY()), 2)));
        }return 0.0;
    }

    private double sideBC() {
        if(topB!=null && topC!=null) {
            return Math.sqrt((Math.pow((topB.getX() - topC.getX()), 2)) +
                    (Math.pow((topB.getY() - topC.getY()), 2)));
        }return 0.0;
    }

    private double semiPerimeter() {
        if(sideAB()!=0.0 && sideAC()!=0.0 &&  sideBC()!=0.0) {
        return (sideAB() + sideAC() + sideBC()) / 2;
        }
       return 0.0;
    }

    @Override
    double getPerimetr() {
        if(sideAB()!=0.0 && sideAC()!=0.0 && sideBC()!=0.0) {
            return sideAB() + sideAC() + sideBC();
        }
        return 0.0;
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
                .append(this.getPerimetr()).append(" Area = ").append(this.getArea());
        return information.toString();
    }
}
