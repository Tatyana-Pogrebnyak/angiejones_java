package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {

        //1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked:");
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter the employee pay rate:");
        double rate = scan.nextDouble();
        scan.close();

        //3. Multiply hours and pay rate
        double grossPay = hours * rate;

        //4. Display the result
        System.out.println("The employee gross pay is: $" + grossPay);

        


    }


}
