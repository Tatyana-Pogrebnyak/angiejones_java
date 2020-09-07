package chapter3;

/*
 * NESTED IF Statemenets:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years. Let's code this.
 */

import java.util.Scanner;

public class CreditQualifier {

    public static void main(String[] args) {

        //Get what we know
        int requiredSalary = 30000;
        int requiredYearsOfWork = 5;

        //Get what we don't know
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: $");
        double actualSalary = scan.nextDouble();

        System.out.println("Enter the number of years with current employeer:");
        double actialYearsOfWork = scan.nextDouble();
        scan.close();

        //Make a decision
        if(actualSalary >= requiredSalary ){
            if(actialYearsOfWork >= requiredYearsOfWork) {
                System.out.println("Congrats! You can get a credit!");
            } else {
                System.out.println("Sorry, you must have worked at your current job at least " + requiredYearsOfWork + " years.");
            }
        } else {
            System.out.println("Sorry, you salary must be at least $" + requiredSalary);
        }

    }



}
