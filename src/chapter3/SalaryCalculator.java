package chapter3;
import java.util.Scanner;
/*
IF statement.
All Salespeople get a salary of $1000 per week.
Those who made more that 10 sales get an additional bonus of $250. Let's code this.
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. Get what we know
        int salary = 1000;
        int bonus = 250;
        int tradeQuota = 10;

        //2.Get what we dont know
        System.out.println("Enter a number of sales employee made this week:");
        int numberOfSales = scan.nextInt();

        //3. Calculate the result
        if(numberOfSales > tradeQuota) {
            salary = salary + bonus;
        }
        System.out.println("Employee's salary is: $" + salary);
    }
}
