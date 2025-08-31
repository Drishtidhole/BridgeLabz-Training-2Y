package Java_Method.javamethod_level1;

import java.util.Scanner;
 public class TriangularParkRun {
    // Method to compute number of rounds needed to complete 5 km
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // in meters
        double distance = 5000; // 5 km in meters
        return distance / perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangle (meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangle (meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangle (meters): ");
        double side3 = sc.nextDouble();
        double rounds = calculateRounds(side1, side2, side3);
        System.out.printf("Number of rounds needed to complete 5 km run: %.2f%n", rounds);
        sc.close();
    }
 }
 
