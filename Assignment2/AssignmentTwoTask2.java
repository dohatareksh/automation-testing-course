package Assignment2;
import java.util.Scanner;
public class AssignmentTwoTask2 {
    //Write a grade classifier: read an integer score from Scanner. Use if/else-if to print 'Excellent' (≥90), 'Good'
    //(≥75), 'Pass' (≥60), or 'Fail' (<60). Then rewrite using switch with arrow syntax. Both should produce identical
    //output for the same input.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student score: ");
        int score = input.nextInt();

        // Part 1: Using if-else
        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 75) {
            System.out.println("Good");
        } else if (score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Part 2: Using switch
        int category;

        if (score >= 90) {
            category = 1;
        } else if (score >= 75) {
            category = 2;
        } else if (score >= 60) {
            category = 3;
        } else {
            category = 4;
        }

        switch (category) {
            case 1 -> System.out.println("Excellent");
            case 2 -> System.out.println("Good");
            case 3 -> System.out.println("Pass");
            default -> System.out.println("Fail");
        }
    }
    }


