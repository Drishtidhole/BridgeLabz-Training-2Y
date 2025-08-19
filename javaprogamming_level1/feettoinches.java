import java.util.Scanner;
public class feettoinches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter measurement in feet: ");
        double feet = scanner.nextDouble();
        double inches = feet * 12;
        System.out.println(feet + " feet is equal to " + inches + " inches.");
        scanner.close();
    }
}