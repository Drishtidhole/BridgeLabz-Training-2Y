package string.string_level1;

import java.util.Scanner;

public class illegaarg {
    public static void main(String[] args) {
        String str = "hello";
        try {
            System.out.println(str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
