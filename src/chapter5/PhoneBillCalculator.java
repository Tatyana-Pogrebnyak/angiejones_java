package chapter5;
import java.util.Scanner;

/*
Calculate phone bill. Allow User to input  the base cost of the plan and amount of minutes User spent over the plan.
Charge the User $0.25 for every minute spent over plan.
Charge the User 15% Tax on the subtotal.

Create separate methods to calculate Tax, overplan minutes fees and final total cost.
Print the bill for every item.
 */

public class PhoneBillCalculator {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //Enter the base cost of the plan
        double planPrice = getPlanPrice();

        //Enter amount of minutes User spent over the plan
        double minutesOverraged = getMinutesOverraged();

        //calculate Overage minutes fees
        double overageMinutesFee = calculateOverageMinutesFee(minutesOverraged);

        //calculate Tax
        double subtotal = planPrice + overageMinutesFee;
        double tax = calculateTax(subtotal);

        //calculate final Total cost
        //Print Phone Bill to User: Plan, Overage minutes, Tax, Total cost
        calculateTotalCost(planPrice, overageMinutesFee, tax);
    }

    public static double getPlanPrice(){
        System.out.println("Enter the base cost of the plan: $");
        double planPrice = scan.nextDouble();
        return planPrice;
    }

    public static double getMinutesOverraged(){
        System.out.println("Enter amount of minutes User spent over the plan:");
        double minutesOverraged = scan.nextDouble();
        return minutesOverraged;
    }

    private static double calculateOverageMinutesFee(double minutes) {
        return (0.25 * minutes);
    }

    private static double calculateTax(double subtotal) {
        return (0.15 * subtotal);
    }

    private static void calculateTotalCost(double planPrice, double overageMinutesFee, double tax) {
        double finalTotal = planPrice + overageMinutesFee + tax;

        System.out.println("Phone Bill Statement:");
        System.out.println("Plan: $" + String.format("%.2f", planPrice));
        System.out.println("Overage: $" + String.format("%.2f", overageMinutesFee));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}
