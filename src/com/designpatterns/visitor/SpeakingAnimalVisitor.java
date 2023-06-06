public class SpeakingAnimalVisitor implements AnimalVisitor {

    @Override
    public void visit(Dog dog) {
        System.out.println("This is Dog! His name is " + dog.getName());
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("This is Cat! Her name is " + cat.getName());
    }
}