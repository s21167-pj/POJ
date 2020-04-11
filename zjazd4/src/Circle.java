/*
Circle UML chart extending Shape implemented in Java.
Author: Marcel P
 */
public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double getPerimeter() {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    @Override
    public String toString() {
        return "Circle[Shape[color=" +
                getColor() +
                ", filled=" +
                isFilled() +
                "]radius=" + radius +
                ']';
    }
}
