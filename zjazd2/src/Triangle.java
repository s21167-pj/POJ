/*
Simple Triangle class and methods calculating area, circuit and defining it type implemented in Java.
Author: Marcel
*/

public class Triangle {

    private float firstSide;
    private float secondSide;
    private float thirdSide;

    public Triangle(float firstSide, float secondSide, float thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public float getFirstSide() {
        return firstSide;
    }

    public float getSecondSide() {
        return secondSide;
    }

    public float getThirdSide() {
        return thirdSide;
    }

    public void setFirstSide(float firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(float secondSide) {
        this.secondSide = secondSide;
    }

    public void setThirdSide(float thirdSide) {
        this.thirdSide = thirdSide;
    }

    static void calcRectangleArea(float firstSide, float secondSide, float thirdSide) {
        if ((firstSide + secondSide) > thirdSide && (firstSide + thirdSide) > secondSide && (secondSide + thirdSide) > firstSide) {
            float halfCircuit = (firstSide + secondSide + thirdSide) / 2;
            double area = Math.sqrt(halfCircuit * (halfCircuit - firstSide) * (halfCircuit - secondSide) * (halfCircuit - thirdSide));
            System.out.println(area);
        } else
            System.out.println("Area of Triangle not exist");
    }

    static void calcRectangleCircuit(float firstSide, float secondSide, float thirdSide) {
        float circuit = (firstSide + secondSide + thirdSide);
        System.out.println(circuit);
    }

    static void isEquilateral(float firstSide, float secondSide, float thirdSide) {
        if (firstSide == secondSide && secondSide == thirdSide)
            System.out.println("Equilateral");
        else
            System.out.println("No equilateral");
    }

    static void isIsosceles(float firstSide, float secondSide, float thirdSide) {
        if ((firstSide == secondSide && secondSide != thirdSide) || (firstSide != secondSide && thirdSide == firstSide) || (thirdSide == secondSide && thirdSide != firstSide))
            System.out.println("Isosceles");
        else
            System.out.println("No isosceles");
    }

    static void isScalene(float firstSide, float secondSide, float thirdSide) {
        if (firstSide != secondSide && secondSide != thirdSide && thirdSide != firstSide)
            System.out.println("Scalene");
        else
            System.out.println("No scalene");
    }

    public static void main(String[] args) {
        calcRectangleArea(30, 20, 30);
        calcRectangleCircuit(30, 20, 30);
        isEquilateral(10, 10, 10);
        isIsosceles(10, 20, 10);
        isScalene(10, 20, 30);
    }
}
