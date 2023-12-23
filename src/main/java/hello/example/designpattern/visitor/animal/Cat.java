package hello.example.designpattern.visitor.animal;

/**
 * ConcreteElement
 */
public class Cat implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
