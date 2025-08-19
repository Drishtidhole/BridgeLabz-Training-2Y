import java.util.Scanner;
public class perimeterofrectangle{
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter length of rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter width of rectangle: ");
        float width = sc.nextFloat();
        float perimeter = 2 * (length+width);
        System.out.printf("perimeteris:",perimeter);
        sc.close();
    }
}
    


