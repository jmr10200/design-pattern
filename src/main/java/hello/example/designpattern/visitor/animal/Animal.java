package hello.example.designpattern.visitor.animal;

/**
 * Element 인터페이스
 */
public interface Animal {
    void accept(AnimalVisitor visitor);
}
