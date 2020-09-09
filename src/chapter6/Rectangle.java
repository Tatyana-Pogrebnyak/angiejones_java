package chapter6;

public class Rectangle {

    private double length;
    private double width;

    //constructors
    public Rectangle(){
        length = 10;
        width = 15;
    }
    public Rectangle(double length, double width){
        //this.length = length; //Can be set this way,
        setLength(length);      // or can ve set this way.
        setWidth(width);
    }

    //methods
    double calculatePerimeter(){
        return ((2*length) + (2*width));
    }
    double calculateArea(){
        return length * width;
    }

    //setting values:
    void setLength(double length){
        this.length = length;
    }
    void setWidth (double width){
        this.width = width;
    }

    //getting values:
    double getLength(){
        return length;
    }
    double getWidth(){
        return width;
    }
}
