package javaprogramming_level2;
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the distance in feet: ");
        double feet = scanner.nextDouble();

        
        double yards = feet / 3; 
        double miles = feet / 5280; 

        
        System.out.println("Distance in yards: " + yards);
        System.out.println("Distance in miles: " + miles);

        
        scanner.close();
    }
}


