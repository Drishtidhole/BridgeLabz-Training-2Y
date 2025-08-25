package control_flows.level3;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter day: ");
        int d = sc.nextInt();

        System.out.print("Enter year: ");
        int y = sc.nextInt();

        
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day number: " + d0);

        
        String dayOfWeek;
        switch (d0) {
            case 0: dayOfWeek = "Sunday"; break;
            case 1: dayOfWeek = "Monday"; break;
            case 2: dayOfWeek = "Tuesday"; break;
            case 3: dayOfWeek = "Wednesday"; break;
            case 4: dayOfWeek = "Thursday"; break;
            case 5: dayOfWeek = "Friday"; break;
            case 6: dayOfWeek = "Saturday"; break;
            default: dayOfWeek = "Invalid"; 
        }

        System.out.println("Day of the week: " + dayOfWeek);

        sc.close();
    }
}

