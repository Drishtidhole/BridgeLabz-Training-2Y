package  control_flows.level1;

import java.util.Scanner;
public class largestnumber{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print ("enter 3 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("Is the first number the largest?yes");
        }
        if (num2>num1 && num2>num3){
            System.out.println("Is the second number the largest?yes");
        }
        if (num3>num1 && num3>num2){
            System.out.println("Is the third number the largest?yes");
        }
        scanner.close();

    }
}

    

