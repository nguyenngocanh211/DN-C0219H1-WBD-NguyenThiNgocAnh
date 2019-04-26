package ngonngu_java;

import java.util.Scanner;

public class TemperatureChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit");
                    fahrenheit = scanner.nextInt();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }


    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
