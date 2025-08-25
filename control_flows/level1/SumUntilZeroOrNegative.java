package control_flows.level1;

import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num;

        System.out.println("Enter numbers to add (enter 0 or negative to stop):");

        
        while (true) {
            num = sc.nextInt(); 
            if (num <= 0) {
                break; 
            }
            sum += num; 
        }

        System.out.println("The total sum is: " + sum);

        sc.close();
    }
}
