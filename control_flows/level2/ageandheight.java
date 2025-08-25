package control_flows.level2;

import java.util.Scanner;
 public class ageandheight {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age and heigh");
        int age1 = scanner.nextInt();
        int height1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        int height2 = scanner.nextInt();
        int age3 = scanner.nextInt();
        int height3 = scanner.nextInt();
        if (age1 > age2 && age1 > age3) {
            System.out.println("Amar is the oldest.");
        } else if (age2 > age1 && age2 > age3) {
            System.out.println("akhbar is the oldest.");
        } else {
            System.out.println("anthony is the oldest.");
        }
        if (height1 > height2 && height1 > height3) {
            System.out.println("Amar is the tallest.");
        } else if (height2 > height1 && height2 > height3) {
            System.out.println("akhbar is the tallest.");
        } else {
            System.out.println("anthony is the tallest.");
        }
        scanner.close();

    }

}
