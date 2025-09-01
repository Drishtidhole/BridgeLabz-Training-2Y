package string.string_extra;
import java.util.Scanner;
public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder toggled = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(Character.toLowerCase(c));
            }
        }

        System.out.println("Toggled string: " + toggled.toString());
    }
}
