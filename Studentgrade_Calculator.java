import java.util.*;

class Main {
    Scanner ob = new Scanner(System.in);

    public static void main(String[] args) {
        Main mainInstance = new Main(); // Create an instance of the Main class
        mainInstance.run(); // Call the instance method run
    }

    public void run() {
        int i; // loop counter
        String subjects[] = { "", "English", "Physics", "Chemistry", "Biology", "Mathematics" }; // array to store subject names
        int marks[] = new int[subjects.length]; // array to store marks 
        int total = 0; // total marks in all subjects
        float avg; // average marks
        String grade = ""; // grade allotted to student

        System.out.println("_____________");
        System.out.println("Enter marks secured in each subject:");       
        System.out.println("_____________");

        for (i = 1; i < subjects.length; i++) { // accepting marks
            System.out.print("Enter marks secured in " + subjects[i] + ": ");
            marks[i] = ob.nextInt();
            total += marks[i];
        }

        avg = (float) total / 5;

        // allotting grades
        if (avg > 80.0 && avg <= 100.0) {
            grade = "A";
        } else if (avg <= 80.0 && avg > 61.0) {
            grade = "B";
        } else if (avg > 40.0 && avg <= 60.0) {
            grade = "C";
        } else if (avg > 30 && avg <= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("_STUDENT REPORT_");
        System.out.println("Total Marks: " + total + " out of 500");
        System.out.println("Average: " + avg);
        System.out.println("Grade Secured: " + grade);       
    }
}