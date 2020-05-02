/*  
    Author: Marcel Pankanin  
    MyRectangle class implemented in Java
    Date: 28.04.2020
*/
public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public static void main(String[] args) {
        MyRectangle rec = new MyRectangle(2, 3, 5, 1);
        rec.getArea();
        rec.getPerimeter();
        System.out.println(rec.toString());
    }

    public double getWidth() {
        return (topLeft.getY() - bottomRight.getY());
    }

    public double getLength() {
        return (bottomRight.getX() - topLeft.getX());
    }

    public double getArea() {
        double area = (getLength() * getWidth());
        System.out.println(area);
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (getWidth() + getLength());
        System.out.println(perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "MyRectangle[" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                "]";
    }
}
