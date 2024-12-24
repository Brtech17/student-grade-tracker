import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    // Function to calculate average
    public static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return grades.isEmpty() ? 0 : sum / grades.size();
    }

    // Function to convert average to letter grade
    public static String getLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Function to convert average to GPA
    public static double getGPA(double average) {
        if (average >= 90) {
            return 4.0;
        } else if (average >= 80) {
            return 3.0;
        } else if (average >= 70) {
            return 2.0;
        } else if (average >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        String continueInput;

        System.out.println("Welcome to the Student Grade Tracker!");

        do {
            System.out.print("Enter a grade (0-100): ");
            double grade = scanner.nextDouble();

            // Validate grade input
            if (grade >= 0 && grade <= 100) {
                grades.add(grade);
            } else {
                System.out.println("Invalid grade. Please enter a value between 0 and 100.");
            }

            System.out.print("Do you want to enter another grade? (yes/no): ");
            continueInput = scanner.next();
        } while (continueInput.equalsIgnoreCase("yes"));

        // Calculate and display results
        double average = calculateAverage(grades);
        String letterGrade = getLetterGrade(average);
        double gpa = getGPA(average);

        System.out.println("\nGrade Summary:");
        System.out.println("Grades: " + grades);
        System.out.printf("Average Grade: %.2f%n", average);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.printf("GPA: %.2f%n", gpa);

        scanner.close();
    }
}
