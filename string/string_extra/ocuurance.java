package string.string_extra;
 import java.util.Scanner;
public class ocuurance {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

      
        int[] count = new int[256];
        for (char c : input.toCharArray()) {
            count[c]++;
        }

      
        char maxChar = input.charAt(0);
        int maxCount = count[maxChar];
        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);
            if (count[c] > maxCount) {
                maxCount = count[c];
                maxChar = c;
            }
        }

        System.out.println("Character with maximum occurrence: " + maxChar);
        System.out.println("Number of occurrences: " + maxCount);
    }
}
