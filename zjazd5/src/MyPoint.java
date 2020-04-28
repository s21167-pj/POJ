import java.util.Arrays;

/*
Author: Marcel Pankanin
MyPoint class
 */
public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MyPoint(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" +
                x +
                "," +
                y +
                ")";
    }

    public double distance(int x, int y) {
        double distanceGivenPoint = Math.sqrt((Math.pow((x - getX()), 2) + (Math.pow((y - getY()), 2))));
        System.out.println(distanceGivenPoint);
        return distanceGivenPoint;
    }

    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);

        }
        String myPointsArray = Arrays.toString(points);
        System.out.println(myPointsArray);
    }

    public double distance(MyPoint another) {
        double distanceAnotherPoint = Math.sqrt((Math.pow((x - another.x), 2) + (Math.pow((y - another.y), 2))));
        System.out.println(distanceAnotherPoint);
        return distanceAnotherPoint;
    }

    public double distance() {
        double distanceZeroZeroPoint = Math.sqrt((Math.pow(x, 2) + (Math.pow(y, 2))));
        System.out.println(distanceZeroZeroPoint);
        return distanceZeroZeroPoint;
    }
}