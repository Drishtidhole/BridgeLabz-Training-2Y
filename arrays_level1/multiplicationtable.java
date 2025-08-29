package arrays_level1;

import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int [] num = new int [10];
        for (int i=0;i<num.length; i++){
            num[i]=scanner.nextInt();
            for (int j = 1; j <= 10; j++) {
                System.out.println(num[i] + " x " + j + " = " + (num[i] * j));
            }

        }
        scanner.close();
    }
    
}
