package chapter3;
import java.util.Scanner;

/*
IF-ELSE Statement.
All salespeople are expected to make at least 10 sales each week.
Those who do, they receive a congradulatory message.
Those who dont, they receive a message about amount of missed sales. Let's code this.
 */

public class TradeQuotaCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //1. Get what we know
        int mandatorySales = 10;
        String congradulatoryMessage = "Congrats!! You made good sales this week!";
        String missedSalesMessage = "So sad, you have missed this amount of sales: ";

        //2. Get what we dont know
        System.out.println("Enter the number of sales made this week:");
        int actualSales = scan.nextInt();

        //3. Calculate the result
        if(actualSales >= mandatorySales) {
            System.out.println(congradulatoryMessage);
        } else {
            System.out.println(missedSalesMessage + (mandatorySales - actualSales));
        }


    }
}
