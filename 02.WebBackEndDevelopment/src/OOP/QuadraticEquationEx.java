package OOP;

import java.util.Scanner;

public class QuadraticEquationEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao he so a cua phuong tring bac 2 ax2 + bx + c = 0");
        double a = scanner.nextDouble();
        System.out.println("nhap vao he so b cua phuong tring bac 2 ax2 + bx + c = 0");
        double b = scanner.nextDouble();
        System.out.println("nhap vao he so c cua phuong tring bac 2 ax2 + bx + c = 0");
        double c = scanner.nextDouble();

        QuadraticEquation equa1 = new QuadraticEquation(a,b,c);
        equa1.display();


    }
}
