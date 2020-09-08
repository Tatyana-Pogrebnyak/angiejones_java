package chapter5;

import java.util.Scanner;

/*
Variable scope.
Write an 'instant credit check' program that approves anyone who makes more than $25000
and has credit trust = 700 or more. Reject all others. Let's code this.
 */
public class InstantCreditCheck_variant2 {

    static Scanner scan = new Scanner(System.in);

    //Get what we know
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;

    public static void main(String[] args) {

        int salary = getUserSalary();
        int creditScore = getUserCreditScore();
        scan.close();
        boolean result = isUserQualified(salary, creditScore);
        notifyUser(result);
    }

    //Get what we don't know
    public static int getUserSalary(){
        System.out.println("Enter your salary:");
        int actualSalary = scan.nextInt();
        return actualSalary;
    }

    public static int getUserCreditScore(){
        System.out.println("Enter your credit score:");
        int actualCreditScore = scan.nextInt();
        return actualCreditScore;
    }

    //Calculate credit check for User
    public static boolean isUserQualified(int actualSalary, int actualCreditScore) {
        if(actualSalary > requiredSalary && actualCreditScore >= requiredCreditScore){
           return true;
        } else {
            return false;
        }
    }

    private static void notifyUser(boolean result) {
        if (result) {
            System.out.println("Congrats! Credit is approved.");
        } else {
            System.out.println("Sorry, credit is not approved.");
        }
    }
}
