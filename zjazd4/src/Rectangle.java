/*
Rectangle UML chart extending Shape implemented in Java.
Author: Marcel P
 */
public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = width * length;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle[Shape[color=" + getColor() +
                ", filled=" + isFilled() +
                "]width=" + width +
                ", length=" + length +
                ']';
    }
}
