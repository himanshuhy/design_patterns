public class Cat extends Animal {

    @Override
    public String getName() {
        return "I am a CAT!";
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
    
}
