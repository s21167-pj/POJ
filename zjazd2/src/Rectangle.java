/*
Simple Rectangle class and methods calculating area, circuit and diagonal implemented in Java.
Author: Marcel
*/
public class Rectangle {
    private float lenght;
    private float width;

    public Rectangle(float lenght, float width) {
        this.lenght = lenght;
        this.width = width;
    }

    public float getLenght() {
        return lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    static void calcRectangleArea(float lenght, float width) {
        float area = lenght * width;
        System.out.println(area);
    }

    static void calcRectangleCircuit(float lenght, float width) {
        float circuit = (2 * lenght + 2 * width);
        System.out.println(circuit);
    }

    static void calcRectangleDiagonal(float lenght, float width) {
        double diagonal = Math.sqrt((Math.pow(lenght, 2) + Math.pow(width, 2)));
        System.out.println(diagonal);
    }

    public static void main(String[] args) {
        calcRectangleArea(5, 10);
        calcRectangleCircuit(5, 10);
        calcRectangleDiagonal(5, 10);
    }
}
