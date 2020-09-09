package chapter6;
/*
Write a class that creates 2 instances (objects) of the Rectangle class
to calculate total area of 2 rooms the the house. Lets code this.
 */

public class HomeAreaCalculator {
    public static void main(String[] args) {
        //main method runs the flow of the program.

        /****************
         * Rectangle 1
         ****************/
        //Create a new object 'room1' using default constructor with predefined values 10*15:
        Rectangle room1 = new Rectangle();

        //Update values for length and width for 'room1':
        room1.setLength(25);
        room1.setWidth(30);

        //Calculate the area of 'room1':
        double areaOfRoom1 = room1.calculateArea();

        /****************
         * Rectangle 2
         ****************/

        Rectangle room2 = new Rectangle(45, 70);
        double areaOfRoom2 = room2.calculateArea();

        //Calculate total area of 2 rooms the the house:
        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Total area of 2 rooms the the house = " + totalArea);

    }


}
