public class Dog extends Animal {

    @Override
    public String getName() {
        return "I am a dog!";
    }
    
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
