package org.example;

public class Circle extends Shape {
    private final double CONSTANT_PI = 3.14;
    Point radiusPoint;
    private Point center;

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadiusPoint(Point radiusPoint) {
        if ((radiusPoint != this.center) &&
                (center.getY() != radiusPoint.getY())
                && (center.getX() != radiusPoint.getX()))
            this.radiusPoint = radiusPoint;
    }

    private double radius() {
        return Math.sqrt(Math.pow(radiusPoint.getX() - center.getX(), 2) +
                Math.pow(radiusPoint.getY() - center.getY(), 2));
    }

    @Override
    double getPerimetr() {
        return 2 * CONSTANT_PI * radius();
    }

    @Override
    double getArea() {
        return CONSTANT_PI * Math.pow(radius(), 2);
    }

    @Override
    public String toString() {
        StringBuilder information = new StringBuilder();
        information.append("Circle ").append("Perimetr = ")
                .append(this.getPerimetr())
                .append("Area = ").append(this.getArea());
        return information.toString();
    }
}
