package string.string_level2;
import java.util.Scanner;
public class texttowords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        System.out.println("Number of words: " + words.length);
    }
}
