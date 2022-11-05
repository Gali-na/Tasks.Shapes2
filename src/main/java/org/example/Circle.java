package org.example;

import java.util.Objects;

public class Circle extends Shape {
    private final double pi = 3.14;
    private Point radiusPoint;
    private Point center;

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadiusPoint(Point radiusPoint) {
        if (!(radiusPoint.equals(this.center))) {
            this.radiusPoint = radiusPoint;
        }
    }

    private double radius() {
        double rezult = 0.0;
        if (!radiusPoint.equals(center)) {
            rezult = Math.sqrt(Math.pow(radiusPoint.getX() - center.getX(), 2)
                    + Math.pow(radiusPoint.getY() - center.getY(), 2));
        }

        return rezult;
    }

    @Override
    double getPerimetr() {
        return 2 * pi * radius();
    }

    @Override
    double getArea() {
        return pi * Math.pow(radius(), 2);
    }

    @Override
    public String toString() {
        StringBuilder information = new StringBuilder();
        information.append("Circle ").append("Perimetr = ")
                .append(this.getPerimetr())
                .append(" Area = ").append(this.getArea());
        return information.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.pi, pi) == 0
                && radiusPoint.equals(circle.radiusPoint)
                && center.equals(circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pi, radiusPoint, center);
    }


}
