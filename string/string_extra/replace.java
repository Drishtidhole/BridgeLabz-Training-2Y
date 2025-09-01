package string.string_extra;
import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String input = sc.nextLine();
        System.out.println("ente new char");
        char newchar = sc.next().charAt(0);
        System.out.println("enter the word to be replaced");
        char oldchar = sc.next().charAt(0);
        String output = input.replace(oldchar,newchar);
        System.out.println(output);

    }
    
}
