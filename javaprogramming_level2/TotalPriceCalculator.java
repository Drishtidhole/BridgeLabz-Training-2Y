package javaprogramming_level2;


import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = scanner.nextDouble();

        
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();

        
        double totalPrice = unitPrice * quantity;

       
        System.out.printf("Total price: $%.2f%n", totalPrice);

       
        scanner.close();
    }
}

