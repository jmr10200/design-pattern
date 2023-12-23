package hello.example.designpattern.visitor.animal;

/**
 * ConcreteElement
 */
public class Panda implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
