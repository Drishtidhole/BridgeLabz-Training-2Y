class Product implements Cloneable {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

public class PrototypeDemo {
    public static void main(String[] args) {
        Product original = new Product("Laptop", 75000);
        Product copy = original.clone();

        System.out.println("Original: " + original.name + " - ₹" + original.price);
        System.out.println("Cloned: " + copy.name + " - ₹" + copy.price);
    }
}
