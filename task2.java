package TaskCodeway;

import java.util.Scanner;
// Task 2
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Take marks obtained (out of 100) in each subject
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        int[] subjectMarks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subjectMarks[i] = sc.nextInt();
        }

        // Calculate Total Marks
        int totalMarks = 0;
        for (int marks : subjectMarks) {
            totalMarks += marks;
        }

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
