package OOP.ExercisePoint2DnPoint3D;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;
    public Point2D() {
    }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX( float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y ) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] result = {x,y};
        return result;
    }

    public String toString() {
        return "co-ordinate x " + getXY()[0] + ", y " + getXY()[1];
    }
}
