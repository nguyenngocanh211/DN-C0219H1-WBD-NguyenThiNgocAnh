package ngonngu_java;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf(year + "is a leap year");
                } else {
                    System.out.printf(year + "is NOT a leap year");
                }
            } else {
                System.out.printf(year + "is a leap year");
            }
        } else {
            System.out.printf(year + "is NOT a leap year");
        }
    }
}
