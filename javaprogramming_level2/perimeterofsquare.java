package javaprogramming_level2;

import java.util.Scanner;

public class perimeterofsquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter length of side");
        double side = scanner.nextDouble();
        double perimeter = 4 * side;
        System.out.println("Perimeter of square: " + perimeter);
        scanner.close();
    }
    
}
