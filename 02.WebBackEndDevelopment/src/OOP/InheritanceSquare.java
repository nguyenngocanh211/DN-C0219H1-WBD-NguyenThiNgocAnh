package OOP;

public class InheritanceSquare extends InheritanceRectangle {
    public InheritanceSquare() {
    }

    public InheritanceSquare(double side) {
        super(side, side);
    }

    public InheritanceSquare(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide( double side) {
        setWidth(side);
        setLength(side);
    }
@Override
    public void setWidth(double width) {
        setSide(width);
    }
    public void setLength(double length){
        setSide(length);
    }
@Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
