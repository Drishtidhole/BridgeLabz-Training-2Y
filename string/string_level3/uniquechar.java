package string.string_level3;
import java.util.Scanner;
public class uniquechar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = findUniqueCharacters(input);
        System.out.println("Unique characters: " + result);
    }

    public static String findUniqueCharacters(String str) {
        StringBuilder uniqueChars = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (uniqueChars.indexOf(String.valueOf(c)) == -1) {
                uniqueChars.append(c);
            }
        }
        return uniqueChars.toString();
    }
}
