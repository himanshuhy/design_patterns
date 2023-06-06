
public class Demo {
    public static void main(String[] args) {
        System.out.println("This is demo for visitor pattern!");

        HandlerDemo handler = new HandlerDemo();
        Animal otherDog = new Dog();
        // This doesnt work with Java
        // handler.handle(otherDog);
        // handler.handle(dog);

        // Lets say we want to add functionality of speaking to Dog and Cat
        // one option is to add the methods to the Animal class and to all the classes
        // but it modifies the existing classes, if I want to enable adding new features
        // without modifying existing classes.
        Animal dog = new Dog();
        Animal cat = new Cat();
        AnimalVisitor speak = new SpeakingAnimalVisitor();
        dog.accept(speak);
        cat.accept(speak);
    }
}

/**
 * This class shows that in Java, method overloading only works at compile time
 * if the client of HandlerDemo has "Animal" type, they cannot at compile time
 * know which 'handle' method to execute.
 * 
 * If the type of object with the client is "Animal", compiler only knows that 
 * it needs to find Animal type as parameter here. Hence it doesnt work in Java
 */
class HandlerDemo {
    void handle(Dog dog) {
        System.out.println("Bhow!");
    }
    void handle(Cat cat) {
        System.out.println("MEOW!");
    }
}