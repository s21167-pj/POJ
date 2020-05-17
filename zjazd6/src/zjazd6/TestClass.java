package zjazd6;

/*
    Author: Marcel Pankanin  
    TestClass class implemented in Java
    Date: 17.05.2020
*/
public class TestClass {
    public static void main(String[] args) {
        Movable rightPoint = new MovableRectangle(30, 30, 60, 60, 10, 10);
        System.out.println(rightPoint);
        rightPoint.moveLeft();
        System.out.println(rightPoint);

        Movable wrongPoint = new MovableRectangle(60, 60, 30, 30, 10, 5);
        System.out.println(wrongPoint);
        wrongPoint.moveLeft();
        System.out.println(wrongPoint);

        GeometricObject constantCircle = new Circle(10);
        System.out.println(constantCircle);
        System.out.println("area is: " + constantCircle.getArea());
        System.out.println("perimeter is: " + constantCircle.getPerimeter());

        Resizable changingCircle = new ResizableCircle(20);
        System.out.println(changingCircle);
        changingCircle.resize(50);
        System.out.println(changingCircle);

        Machine coffeMaker = new Machine("victor");
        System.out.println(coffeMaker);

        Athlete someAthlete = new Athlete("seba");
        System.out.println(someAthlete);

        PoliticalCandidate someCandidate = new PoliticalCandidate("marek");
        System.out.println(someCandidate);

    }
}
