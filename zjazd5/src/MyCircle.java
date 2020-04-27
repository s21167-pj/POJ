/*  
    Author: Marcel Pankanin  
    MyCircle class implemented in Java
    Date: 27.04.2020
*/
public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle() {
    }

    public MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return this.center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
       this.center.setX(x);
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterY(int y){
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        return new int[]{center.getX(), center.getY()};
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    @Override
    public String toString() {
        return "MyCircle[" +
                radius + "=r"+ "," +
                "center=" + center.toString() +
                "]";
    }


    public static void main(String[] args) {
        MyCircle kolko = new MyCircle(1,2,2);
        System.out.println(kolko.toString());
    }
}
