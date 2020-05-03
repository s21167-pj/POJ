/*  
    Author: Marcel Pankanin  
    MyRectangle class implemented in Java
    Date: 28.04.2020
*/
public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(Math.min(x1, x2), Math.max(y1, y2));
        this.bottomRight = new MyPoint(Math.max(x1, x2), Math.min(y1, y2));
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
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
