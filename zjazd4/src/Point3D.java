import java.util.Locale;

/*
Point3D UML chart extending Point2D implemented in Java.
Author: Marcel P
 */
public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] result = {getX(), getY(), z};
        return result;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "\"(%.1f,%.1f)\"", getX(), getY(), z);
    }

}
