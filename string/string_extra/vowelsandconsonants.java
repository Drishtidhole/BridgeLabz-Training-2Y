package string.string_extra;
import java.util.Scanner;
public class vowelsandconsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a string");
        String input =  sc.nextLine();
        int vowels=0;
        int consonants=0;
        for (int i =0 ; i<input.length();i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if ("AEIOUaeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    
}
