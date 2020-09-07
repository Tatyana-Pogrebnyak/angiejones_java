package chapter3;
/*
Program ask a User to enter their letter grade (A-F) and based on it, print out a message.
Lets code this.
*/

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your letter grade:");
        String letterGrade = scan.next();

        switch (letterGrade){
            case "A":
                System.out.println("Excellent job!");
                break;
            case "B":
                System.out.println("Great job!");
                break;
            case "C":
                System.out.println("Good job!");
                break;
            case "D":
                System.out.println("Fine job! But you can do better.");
                break;
            case "F":
                System.out.println("Bad job! Try a bit harder.");
                break;
            default:
                System.out.println("Error. Incorrect letter grade entered.");
        }

    }


}
