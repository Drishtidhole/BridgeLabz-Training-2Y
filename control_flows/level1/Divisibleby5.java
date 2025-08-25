package  control_flows.level1;

import java.util.Scanner;

public class Divisibleby5 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("enter a number");
        int num = scanner.nextInt();

        if (num%5==0){
            System.out.println("is the number " + num + " divisible by 5? Yes");
        }else {
            System.out.println("is the number " + num + " divisible by 5? No");
        }
        scanner.close();


    }
}
 
