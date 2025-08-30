package string.string_level1;
import java.util.Scanner;
public class numberformat {
    public static void main(String[] args) {
        String input = "123abc";
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

}
