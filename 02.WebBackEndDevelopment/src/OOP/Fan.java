package OOP;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    //speed field
    private int speed = SLOW;
    //on field
    private boolean status = false;
    //radius field
    private double radius = 5;
    //color field
    private String color = "blue";

    public Fan() {}
    public Fan (int speed, boolean status, double radius, String color ) {
        this.speed = speed;
        this.status = status;
        this.radius =radius;
        this.color= color;
    }



    //getter setter
    public int getSpeed() {
        return speed;
    }

    public boolean getStatus() {
        return status;
    }

    public double getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean on) {
        this.status = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //tra ve thong tin
    public String toString() {
        if (this.status == true) {
            return "Speed:  " + speed + " color: " + color + " radius: " + radius + " fan is on";
        } else {
            return " color: " + color + " radius: " + radius + "fan is off";
        }
    }
}
