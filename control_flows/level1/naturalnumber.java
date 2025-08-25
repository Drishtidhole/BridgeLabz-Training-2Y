package  control_flows.level1;

import java.util.Scanner;

public class naturalnumber{
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.print ("enter a number");
        int num = scanner.nextInt();
        if (num>0){
            int sum = 0;
            sum = num*(num+1)/2;
            System.out.println("The sum of " + num + " natural numbers is " + sum);
        }
        else {
            System.out.println("The number" + num + "is not a natural number");
        }
        scanner.close();

    } 
}