package chapter6;
import java.util.Scanner;

/*
Write an advanced version of Rectangle class that creates 2 instances (objects) of the Rectangle class.
Calculate the perimeter of 2 rooms the the house: Kitchen and Bathroom.
Use objects as an arguments for methods calculation this time.
 */

public class HomePlanner {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //1. Create a local object 'homePlanner' to be able to access class methods createKitchen and createBathroom.
        HomePlanner homePlanner = new HomePlanner();

        //2. Create two objects to represent Kitchen and Bathroom of our house.
        Rectangle myKitchen = homePlanner.createKitchen();
        Rectangle myBathroom = homePlanner.createBathroom();

        //3. Call methods to calculate perimeter for Kitchen and Bathroom
        double kitchenPerimeter = myKitchen.calculatePerimeter();
        double bathroomPerimeter = myBathroom.calculatePerimeter();

        //4. Output the result of calculations
        System.out.println("Total perimeter of kitchen and bathrom is: " + (kitchenPerimeter + bathroomPerimeter) + " metres.");
    }

    //Write a method that creates new dressing room object based on User's input:
    public Rectangle createKitchen(){
        System.out.println("Enter Kitchen length:");
        double length = scan.nextDouble();

        System.out.println("Enter Kitchen width:");
        double width = scan.nextDouble();

        Rectangle myKitchen = new Rectangle(length, width);
        return myKitchen;
    }

    //Write a method that creates new Bathroom object based on User's input
    public Rectangle createBathroom(){
        System.out.println("Enter bathroom length:");
        double length = scan.nextDouble();

        System.out.println("Enter bathroom width:");
        double width = scan.nextDouble();

        Rectangle myBathroom = new Rectangle(length, width);
        return  myBathroom;
    }

}
