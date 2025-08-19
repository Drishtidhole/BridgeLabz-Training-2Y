import java.util.Scanner;

public class Squaresidecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of one side of the square: ");
        double sideLength = scanner.nextDouble();
        
        double area = sideLength * sideLength;
        double perimeter = 4 * sideLength;
        
        System.out.println("The area of the square is: " + area);
        System.out.println("The perimeter of the square is: " + perimeter);
        
        scanner.close();
    }
}