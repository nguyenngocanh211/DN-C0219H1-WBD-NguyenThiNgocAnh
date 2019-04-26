package OOP.ExerciseCircleCylinder;

public class Circle {
    private String color;
    private double radius;

    public Circle() {
    }
    public Circle(String color, double radius){
        this.color=color;
        this.radius=radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "A Circle with r=" + getRadius() + ", with color: " + getColor()+ ", and area is " + getArea();
    }
}
