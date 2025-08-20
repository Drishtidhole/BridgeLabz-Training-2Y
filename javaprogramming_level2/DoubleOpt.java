package javaprogramming_level2;
import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        double fee, discountPercent, c;

        
        System.out.print("Enter value for fee: ");
        fee = scanner.nextDouble();
        System.out.print("Enter value for discountPercent: ");
        discountPercent = scanner.nextDouble();
        System.out.print("Enter value for c: ");
        c = scanner.nextDouble();

        double result1 = fee + discountPercent * c; 
        double result2 = fee * discountPercent + c; 
        double result3 = c + fee / discountPercent; 
        double result4 = fee % discountPercent + c; 

        
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n", result1, result2, result3, result4);

        scanner.close();
    }
}
