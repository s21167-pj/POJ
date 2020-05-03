/*
    Author: Marcel Pankanin  
    MyRectangleTest class implemented in Java
    Date: 03.05.2020
*/
public class MyRectangleTest {
    public static void main(String[] args) {
        MyRectangle rec = new MyRectangle(2, 3, 5, 1);
        rec.getArea();
        rec.getPerimeter();
        System.out.println(rec.toString());
        MyRectangle recTwo = new MyRectangle(10, 20, 5, 10);
        recTwo.getArea();
        recTwo.getPerimeter();
        System.out.println(recTwo.toString());
        MyRectangle recThree = new MyRectangle(-10, -20, -5, -10);
        recThree.getArea();
        recThree.getPerimeter();
        System.out.println(recThree.toString());

    }
}
