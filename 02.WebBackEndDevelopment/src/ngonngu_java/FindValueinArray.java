package ngonngu_java;

import java.util.Scanner;

public class FindValueinArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i< students.length; i++){
            if (students[i].equals(input)) {
                System.out.println("Position of the students in the list " + input + " is: " + (i + 1));
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Not found");
        }
    }
}
