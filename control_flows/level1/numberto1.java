package control_flows.level1;

import java.util.Scanner;

public class numberto1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = scanner.nextInt();
        while (num > 1) {
            System.out.println(num);
            num--;
        }
        scanner.close();

    }
}