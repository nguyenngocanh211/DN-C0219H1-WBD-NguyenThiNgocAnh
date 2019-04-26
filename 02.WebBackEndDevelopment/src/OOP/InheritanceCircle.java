package OOP;

public class InheritanceCircle extends InheritanceShape {
    private double radius;

    public InheritanceCircle() {
    }

    public InheritanceCircle(double radius) {
        this.radius = radius;
    }

    public InheritanceCircle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }

}
