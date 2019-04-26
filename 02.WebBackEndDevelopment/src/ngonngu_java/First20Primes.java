package ngonngu_java;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class First20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}







