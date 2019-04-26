package OOP.ExerciseCircleCylinder;

public class Cylinder extends Circle {
    double height;
    public Cylinder() {
    }


    public Cylinder(String color, double radius, double height) {
        super(color,radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height=height;
    }
    public double getVol() {
        return getArea()*height;
    }
    @Override
    public String toString() {
        return "A Cylinder with r=" + getRadius() + ", with color: " + getColor()+ ", and Volume is " + getVol();
    }
}
