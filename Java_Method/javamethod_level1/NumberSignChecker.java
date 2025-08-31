package Java_Method.javamethod_level1;

import java.util.Scanner;
 public class NumberSignChecker {
    // Method to return -1 for negative, 1 for positive, 0 for zero
    public static int checkNumberSign(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int result = checkNumberSign(number);
        if (result == 1) System.out.println("Number is positive.");
        else if (result == -1) System.out.println("Number is negative.");
        else System.out.println("Number is zero.");
        sc.close();
    }
}
