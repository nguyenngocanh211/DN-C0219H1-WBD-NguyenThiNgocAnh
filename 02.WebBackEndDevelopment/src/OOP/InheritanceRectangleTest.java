package OOP;

public class InheritanceRectangleTest {
        public static void main(String[] args) {
            InheritanceShape rectangle = new InheritanceRectangle();
            System.out.println(rectangle);

            InheritanceShape rectangle1 = new InheritanceRectangle(2.3, 5.8);
            System.out.println(rectangle);

            InheritanceShape rectangle2= new InheritanceRectangle(2.5, 3.8, "orange", true);
            System.out.println(rectangle);
        }
    }
