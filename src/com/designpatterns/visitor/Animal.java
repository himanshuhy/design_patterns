abstract public class Animal  {

    abstract public String getName();

    abstract public void accept(AnimalVisitor visitor);
}