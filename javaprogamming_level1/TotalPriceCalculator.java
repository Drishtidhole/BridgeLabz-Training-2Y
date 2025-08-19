import java.util.Scanner;
public class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        double price = scanner.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        double totalPrice = price * quantity;
        System.out.println("The total price is: " + totalPrice);
        scanner.close();
    }
}
