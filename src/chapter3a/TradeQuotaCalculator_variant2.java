package chapter3a;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/*
IF-ELSE Statement.
All salespeople are expected to make at least 10 sales each week.
Those who do, they receive a congradulatory message.
Those who dont, they receive a message about amount of missed sales. Let's code this.
 */

public class TradeQuotaCalculator_variant2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of sales made this week:");
        int actualSales = scan.nextInt();

        int mandatorySales = 10;

        //3. Calculate the result
        String message;
        if(actualSales >= mandatorySales) {
            message = "Congrats!! You made good sales this week! Your sales amount is " + actualSales;
        } else {
            message = "So sad, you have missed this amount of sales: " + (mandatorySales - actualSales);
        }
        System.out.println(message);
    }
}
