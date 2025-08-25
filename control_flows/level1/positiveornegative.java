package control_flows.level1;

import java.util.Scanner;

public class positiveornegative{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        if (num>0){
            System.out.println("number is positive");
        }
        else if ( num<0){
            System.out.println("number is negative");
        }
        else {
            System.out.println("number is zero");
        }
        scanner.close();
        
    }
}