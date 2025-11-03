package lambda;
import java.util.*;

class Product {
    String name;
    double price, rating, discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | ₹" + price + " | ⭐" + rating + " | " + discount + "% off";
    }
}

public class ECommerceSort {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Shoes", 2500, 4.5, 20),
            new Product("Watch", 4000, 4.8, 10),
            new Product("Bag", 1500, 4.2, 30)
        );

        products.sort((a, b) -> Double.compare(a.price, b.price));
        System.out.println("\nSorted by Price:");
        products.forEach(System.out::println);

        
        products.sort((a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        products.sort((a, b) -> Double.compare(b.discount, a.discount));
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}

