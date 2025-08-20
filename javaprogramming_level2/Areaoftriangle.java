package javaprogramming_level2;

import java.util.Scanner;

public class Areaoftriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter base:");
    double base = scanner.nextDouble();
    System.out.println("enter height:");
    double height = scanner.nextDouble();
    double area = (base * height) / 2;
    double inches = area * 2.54;
    System.out.println("Area of triangle in square inches: " + inches);
    
  }
    
}
