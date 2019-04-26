package OOP.ExercisePoint2DnPoint3D;

public class Point3D extends Point2D {
    float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x,y);
        this.setZ(z);
    }

    public float[] getXYZ() {
        float[] result = {x, y, z};
        return result;
    }
    @Override
    public String toString() {
        return "co-ordinate x " + x + ", y " + y + ", z " + z;
    }
}


