package OOP;

public class FanEx {
    public static void main(String[] args) {
//        Fan fan1 = new Fan();
//        fan1.setStatus(true);
//        fan1.setColor("yellow");
//        fan1.setSpeed(Fan.FAST);
//        fan1.setRadius(10);
//        System.out.println(fan1);
        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        System.out.println(fan1);
    }
}
