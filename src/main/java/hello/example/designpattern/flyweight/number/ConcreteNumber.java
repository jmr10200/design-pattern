package hello.example.designpattern.flyweight.number;

/**
 * ConcreteFlyweight 클래스
 */
public class ConcreteNumber implements Number {

    private int value;

    public ConcreteNumber(int value) {
        this.value = value;
    }

    @Override
    public void printNumber() {
        System.out.println("Number: " + value);
    }
}
