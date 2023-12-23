package hello.example.designpattern.visitor.animal;

/**
 * ConcreteVisitor
 */
public class SoundVisitor implements AnimalVisitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("개가 왈왈짖어요");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("고양이가 야옹해요");
    }

    @Override
    public void visit(Panda panda) {
        System.out.println("판다가 낑해요");
    }
}
