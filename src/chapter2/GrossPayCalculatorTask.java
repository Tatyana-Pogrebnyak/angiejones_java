package chapter2;

import java.util.Scanner;

public class GrossPayCalculatorTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. Get the season of the year
        System.out.println("Enter the seaon of the year");
        String season = scan.next();

        //2. Get the whole number
        System.out.println("Enter the whole number:");
        int number = scan.nextInt();

        //3. Get an adjective
        System.out.println("Enter an adjective:");
        String adjective = scan.next();
        //scan.close();

        //4. Calculate the sentence
        System.out.println("On a " + adjective + " " + season +
                " day, I drink minimum of " + number +
                " cups of coffee.");
    }

}
