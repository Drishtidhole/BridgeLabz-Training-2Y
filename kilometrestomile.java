import java.util.Scanner;
 public class kilometrestomile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter distance in kilometer :");
        double kilometer = scanner.nextDouble ();
        double mile = kilometer* 0.621371;
        System.out.printf("distance in mile : %.2f", mile);
        scanner.close();
        
    }
 }