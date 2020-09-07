/*
METHODS.
Write a method that takes a user's name and then greet them by name.
*/
package chapter5;
import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String userName = scan.next();
        scan.close();

        greetUser(userName);
    }

    public static void greetUser(String name){
        System.out.println("Hello, " + name + "!");
    }
}



