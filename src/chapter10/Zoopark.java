package chapter10;

public class Zoopark {

    public static void main(String[] args) {

        Dog bobik = new Dog();
        bobik.fetch();
        bobik.makeSound();

        System.out.println("1) Lucky - has type of Animal, but instance of a Dog.");
        Animal lucky = new Dog();
        //lucky.makeSound(); //woof!

        System.out.println("2) Jack - has type of Animal, but instance of a Cat.");
        Animal jack = new Cat();
        //jack.makeSound(); //meow!

        System.out.println("3) Polymorphysm: create new object of type Cat, but put it to existing var lucky of type Animal. This is legal because Dog and Cat are children of Animal class.");
        lucky = new Cat();
       // lucky.makeSound(); //meow!
       // ((Cat) lucky).scratch();

        Zoopark zoo = new Zoopark();
        zoo.feedAnimal(lucky);
        zoo.feedAnimal(jack);


    }

    public void feedAnimal(Animal animal){ //we can put Animal, Cat or Dog here
        if(animal instanceof Dog){
            System.out.println("Eat DOG food.");
        }
        else if (animal instanceof Cat){
            System.out.println("Eat CAT food.");
        }

    }

}
