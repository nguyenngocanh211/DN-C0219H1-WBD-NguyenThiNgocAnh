package OOP;

public class InheritanceRectangle extends InheritanceShape {
    private double width = 1;
    private double length = 1;

    public InheritanceRectangle() {
    }

    public InheritanceRectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public InheritanceRectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }
    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    public String toString() {
        return "A Rectangle with width=" + getWidth() + " and length=" + getLength() + ", which is a subclass of " + super.toString();
    }
}

