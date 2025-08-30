package string.string_level1;
import java.util.Scanner;
public class uppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String upperCase = input.toUpperCase();
        System.out.println("Uppercase: " + upperCase);
    }
}
