package  control_flows.level1;
  
import java.util.Scanner;
 public class smallerof3 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("enter 3 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
         if (num1<num2 && num1<num3){
            System.out.println("is the first number smallest?Yes");

         }
         else {
            System.out.println("is the first number smallest?no");

         }
         scanner.close();

    }
 }