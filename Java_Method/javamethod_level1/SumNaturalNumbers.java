package Java_Method.javamethod_level1;

import java.util.Scanner;
 public class SumNaturalNumbers {
    // Method to find sum of n natural numbers
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();
        int sum = sumNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }
 }