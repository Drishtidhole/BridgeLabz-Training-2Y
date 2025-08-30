package string.string_level1;
import java.util.Scanner;
public class stringindex {

    public class StringIndexDemo {
    public static void main(String[] args) {
        String str = "hello";

        
        try {
            System.out.println(str.charAt(str.length())); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

    
}
