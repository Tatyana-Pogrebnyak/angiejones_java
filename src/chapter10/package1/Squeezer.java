package chapter10.package1;

import java.util.Base64;

public class Squeezer {

    public static void main(String[] args) {


        //apple1 will get access to methods of Apple class and Fruit class.
        System.out.println("apple 1: type of Apple");
        Apple apple1 = new Apple();
        apple1.bringFruit();
        apple1.washFruit();
        apple1.removeAppleSeeds();
        apple1.makeAppleJuice();
        squeeze(apple1);

        System.out.println("_____________________________");

        //apple2 will get access to methods of Fruit class only. We need casting to get access to Apple's class methods.
        System.out.println("apple 2: type of Fruit");
        Fruit apple2 = new Apple();
        apple2.bringFruit();
        apple2.washFruit();
        ((Apple) apple2).removeAppleSeeds();
        ((Apple) apple2).makeAppleJuice();



//        Fruit apple2 = new Apple();
//        ((Apple) apple2).removeAppleSeeds();
//
//        Fruit apple3 = new Apple();
//        apple3.getCalories();
//        apple3.washFruit();
//        apple3.setCalories(150);
//        apple3.getCalories();
//        apple3.makeJuice();
//
//
//
//        Banana banana = new Banana();
//        banana.peelBanana();
//
//        Fruit banana2 = new Banana();
//        ((Banana) banana2).peelBanana();
//
//        Fruit orange = new Fruit();
//
//        squeeze(apple1);
//        squeeze(banana);
//        squeeze(banana2);
//        squeeze(orange);



    }

    public static  void squeeze(Fruit someFruit){
        if(someFruit instanceof Apple){
            System.out.println("Squeezing APPLE...");
        }
        else if (someFruit instanceof Banana){
            System.out.println("Squeezing Banana.. eww-w-w...");
        }
    }

//    public void getCalories(Fruit someFruit){
//        if(someFruit instanceof Apple){
//            System.out.println("Your apple has calories: " + someFruit.getCalories());
//        }
//        else if (someFruit instanceof Banana){
//            System.out.println("Your banana has calories: " + someFruit.getCalories());
//        }
//    }

}
