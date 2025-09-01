package string.string_extra;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean[] seen = new boolean[256]; 
        String result = "";

     
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            
            if (!seen[ch]) {
                result += ch;
                seen[ch] = true;
            }
        }

        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}

