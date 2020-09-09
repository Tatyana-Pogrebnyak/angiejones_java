package chapter6;
/*
Write an advanced version of Rectangle class that creates 2 instances (objects) of the Rectangle class
to calculate total area of 2 rooms the the house. Use objects as an arguments for methods this time.
 */

import java.util.Scanner;

public class HomeAreaCalculator_variant2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //create new object of current class to be able to call non-static 'getRoom' method:
        HomeAreaCalculator_variant2 hacvar2 = new HomeAreaCalculator_variant2();

        Rectangle kitchen = hacvar2.getRoom();
        Rectangle bathroom = hacvar2.getRoom();

        double totalAreaOfRooms = hacvar2.calculateTotalArea(kitchen, bathroom);
        System.out.println("Total area of 2 rooms the the house is: " + totalAreaOfRooms);

    }


    public double calculateTotalArea(Rectangle roomKitchen, Rectangle roomBathroom){
        double totalArea = roomKitchen.calculateArea() + roomBathroom.calculateArea();
        return totalArea;
    }

    public Rectangle getRoom() {
        System.out.println("Enter the length of your room:");
        double length = scan.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scan.nextDouble();

        return new Rectangle(length, width);

    }
//        public String getName(){
//        System.out.println("Enter your name:");
//        String name =  new String();
//        name = scan.next();
//        return name;
//    }

}
