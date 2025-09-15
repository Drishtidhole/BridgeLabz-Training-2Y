package arrays_level1;
 import java.util.Scanner;
public class multiply6to9 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        
        int[] multiply = new int[4];  

      
        for (int i = 6; i <= 9; i++) {
            multiply[i - 6] = number * i;
        }

       
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiply[i - 6]);
        }

        sc.close();
    }
}

    
    

