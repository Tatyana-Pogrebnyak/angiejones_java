package chapter10.package2;

public class Cat extends Animal {

    @Override
    public void makeSound(){
        System.out.println("Meow-meow!");
    }

    public void scratch(){
        System.out.println("I am a cat. I like scratch things.");
    }
}
