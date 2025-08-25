package control_flows.level1;


import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

        
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            
            int sumFormula = n * (n + 1) / 2;

            
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula : " + sumFormula);

           if (sumFor == sumFormula) {
               System.out.println("Both computations are correct and results match!");
           } else {
               System.out.println("Results do not match, something went wrong!");
           }
       }

        sc.close();
    }
}

