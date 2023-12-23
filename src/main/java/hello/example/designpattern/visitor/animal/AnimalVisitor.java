package hello.example.designpattern.visitor.animal;

/**
 * Visitor 인터페이스
 */
public interface AnimalVisitor {
    void visit(Dog dog);

    void visit(Cat cat);

    void visit(Panda panda);
}
