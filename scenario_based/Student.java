package scenario_based;


import java.util.Arrays;


public class Student {
    
    String name;
    int rollNumber;
    int[] marks = new int[3]; 
    
    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

  
    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : this.marks) {
            total += mark;
        }
        return total;
    }

   
    public void displayStudentDetails() {
        
        String marksString = Arrays.toString(marks)
                                   .replace("[", "")
                                   .replace("]", "");

        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.rollNumber);
        System.out.println("Marks: " + marksString);
        System.out.println("Total Marks: " + calculateTotalMarks());
    }
}





