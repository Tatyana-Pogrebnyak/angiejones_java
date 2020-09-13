package chapter10.package3;

public class test {

    public static void main(String[] args) {

        //polymorphed object
        Vechile mycar = new Car();
        mycar.drive();
        mycar.stop();

        //casting:
        ((Car) mycar).playMusic();
        ((Car) mycar).washing();

        //normal object
        Car tatyanaCar = new Car();
        tatyanaCar.drive();
        tatyanaCar.stop();
        tatyanaCar.playMusic();
        tatyanaCar.washing();
    }
}
