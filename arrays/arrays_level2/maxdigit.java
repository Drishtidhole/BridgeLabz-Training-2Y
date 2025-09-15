package arrays_level2;
 import java.util.Scanner;

public class maxdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int maxDigit = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            num /= 10;
        }

        System.out.println("The maximum digit is: " + maxDigit);
    }
}
