package control_flows.level1;

import java.util.Scanner;
public class numberto1for {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("enter a number ");
        int num = scanner.nextInt();
        for (int i=num; i>=1; i--){
            System.out.println(i);
        }
        scanner.close();
    }
    
}
