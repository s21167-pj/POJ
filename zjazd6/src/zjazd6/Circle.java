package zjazd6;

/*
    Author: Marcel Pankanin  
    Circle class implemented in Java
    Date: 17.05.2020
*/
public class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius = %1$f", radius);
    }
}
