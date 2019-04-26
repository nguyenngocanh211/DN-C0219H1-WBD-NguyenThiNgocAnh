package OOP.ExerciseCircleCylinder.ExercisePointnMoveablePoint;

public class Point {
    float x = 0.0f;
    float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
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
        return "co-ordinary" + getXY()[0] + getXY()[2];
    }
}
