package string.string_level1;

import java.util.Scanner;
public class nullpoint {
    public static void main(String[] args) {

       
        String text = null; 
        
        System.out.println("Length of text: " + text.length());
    }

    
    public static void handleException() {
        String text = null;
        try {
            
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    

        
    }

