package control_flows.level3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input weight (kg) and height (cm)
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();

        // Step 2: Convert height from cm to meter
        double heightM = heightCm / 100;

        // Step 3: Calculate BMI using formula
        double bmi = weight / (heightM * heightM);

        // Step 4: Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal weight";
        } else if (bmi <= 29.9) {
            status = "Overweight";
        } else {
            status = "Obesity";
        }

        // Step 5: Display the result
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Weight Status: " + status);

        sc.close();
    }
}
