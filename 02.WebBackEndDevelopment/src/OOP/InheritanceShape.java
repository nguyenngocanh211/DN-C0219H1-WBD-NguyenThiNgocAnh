package OOP;

public class InheritanceShape {
    private String color ="green";
    private  boolean filled = true;
    public InheritanceShape() {
    }
    public InheritanceShape(String color, boolean filled){
        this.color = color;
        this.filled=filled;
    }
     public String getColor() {
        return color;
     }
     public boolean getFilled() {
        return filled;
     }
     public void setColor() {
        this.color = color;
     }
     public boolean isFilled() {
        return filled;
     }

     @Override
    public  String toString() {
        return "A Shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
}

