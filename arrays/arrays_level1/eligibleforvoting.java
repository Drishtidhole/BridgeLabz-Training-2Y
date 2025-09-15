package arrays_level1;

import java.util.Scanner;

public class eligibleforvoting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter age");
        int [] age = new int [10];
        for (int i = 0; i < age.length; i++) {
            age[i] = scanner.nextInt();
        }
        for (int i = 0; i < age.length; i++) {
            if (age[i] >= 18) {
                System.out.println("Person " + (i + 1) + " is eligible for voting.");
            } else {
                System.out.println("Person " + (i + 1) + " is not eligible for voting.");
            }

        }
        scanner.close();
    }
}
