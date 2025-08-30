package string.string_level2;
import java.util.Scanner;
public class length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int length = input.length();
        System.out.println("Length: " + length);
    }
}
