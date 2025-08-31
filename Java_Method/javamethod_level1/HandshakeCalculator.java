package Java_Method.javamethod_level1;

import java.util.Scanner;
 public class HandshakeCalculator {
    // Method to calculate maximum handshakes using combination formula
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("Maximum number of possible handshakes: " + handshakes);
        sc.close();
    }
 }

