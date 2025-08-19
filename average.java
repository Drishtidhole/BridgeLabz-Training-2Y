import java.util.Scanner ;
public class average {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("enter first number");
        int num1 = scanner.nextInt();
        System.out.print("enter second number");
        int num2 =  scanner.nextInt();
        System.out.print("enter third number");
        int num3 =  scanner.nextInt();
        int average = (num1+num2+num3)/3;
        System.out.printf("average is:", average);
        scanner.close();





    }
}
