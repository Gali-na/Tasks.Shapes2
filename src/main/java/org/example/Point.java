package org.example;

import java.util.Objects;

public class Point {
    double max = Double.MAX_VALUE;
    double min = Double.MIN_VALUE;
    private double x;
    private double y;

    public Point() {
    }

     public Point(double x, double y) {
        if((x>=min && x<=max) && (y>=min && y<=max)) {
            this.x = x;
            this.y = y;
        } else {
            System.out.println("Data sent incorrectly, please try again");
        }
    }

    public void setX(double x) {
        if (x < max && x > min) {
            this.x = x;
        } else {
            System.out.println("Data sent incorrectly, please try again");
        }
    }

    public void setY(double y) {
        if (y < max && y > min) {
            this.y=y;
        }else {
            System.out.println("Data sent incorrectly, please try again");
        }

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.getX(), getX()) == 0 && Double.compare(point.getY(), getY()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}
