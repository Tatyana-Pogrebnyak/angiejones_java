package chapter3;

import java.util.Scanner;

public class StudentTestResults {

    public static void main(String[] args) {

        //Get the test result
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your test result (1-100):");
        int testResult = scan.nextInt();

        //Calculate student's letter grade based on test result (A - F)
        char grade;

        if( testResult < 60) {
            grade = 'F';
        } else if ( testResult < 70) {
            grade = 'D';
        } else if (testResult < 80) {
            grade = 'C';
        } else if (testResult < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println("Your letter grade is: " + grade);

    }
}
