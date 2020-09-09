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
    public double calculatePerimeter(){
        return ((2*length) + (2*width));
    }
    public double calculateArea(){
        return length * width;
    }

    //setting values: make your setters Public to allow other classes acceess them.
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth (double width){
        this.width = width;
    }

    //getting values:
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
}
