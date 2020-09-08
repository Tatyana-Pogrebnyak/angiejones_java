package chapter5;

import java.util.Scanner;

/*
Variable scope.
Write an 'instant credit check' program that approves anyone who makes more than $25000
and has credit trust = 700 or more. Reject all others. Let's code this.
 */
public class InstantCreditCheck {

    public static void main(String[] args) {

        //Get what we know
        int requiredSalary = 25000;
        int requiredCreditScore = 700;

        //Get what we don't know
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary:");
        int actualSalary = scan.nextInt();
        System.out.println("Enter your credit score:");
        int actualCreditScore = scan.nextInt();

        //Calculate credit check for User
        if(actualSalary > 25000 && actualCreditScore >= 700){
            System.out.println("Congrats! Credit is approved.");
        } else {
            System.out.println("Sorry, credit is not approved.");
        }

    }


}
