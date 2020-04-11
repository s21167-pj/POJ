import java.util.Locale;

/*
MovablePoint UML chart extending Point implemented in Java.
Author: Marcel P
 */
public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return this.xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] result = {this.getXSpeed(), this.getYSpeed()};
        return result;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "\"(%.1f,%.1f),speed=(%.1f,%.1f)\"",
                getX(), getY(), xSpeed, ySpeed);
    }

    public MovablePoint move() {
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
        return this;
    }
}

