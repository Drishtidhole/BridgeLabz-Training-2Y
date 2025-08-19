import java.util.Scanner;
public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int people = scanner.nextInt();
        int handshakes = (people * (people - 1)) / 2;
        System.out.println("Total handshakes: " + handshakes);
        scanner.close();
    }
}
