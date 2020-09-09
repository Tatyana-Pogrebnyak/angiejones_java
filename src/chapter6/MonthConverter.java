package chapter6;
import java.util.Scanner;

public class MonthConverter {

static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /****************
         CASE 1. Directly passing values to arguments list:
         ****************/

//        System.out.println(Month.convertMonth(5));
//        System.out.println(Month.convertMonth("September"));



        /****************
         CASE 2. Asking User input:
         ****************/

        System.out.println("Please enter the number of the month (1-12):");
        int monthNumber = scan.nextInt();
        System.out.println("Your month Number '" + monthNumber + "' is equal to: " + Month.convertMonth(monthNumber));

        System.out.println("");

        System.out.println("Please enter the name of the month (January - December). Start name from Upper case only!");
        String monthName = scan.next();
        System.out.println("Your month Name '" + monthName + "' is equal to: " + Month.convertMonth(monthName));


    }

}
