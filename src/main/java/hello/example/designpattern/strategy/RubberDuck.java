package hello.example.designpattern.strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        // 날 수 없음
        flyBehavior = new FlyNoWay();
        // 꾸애액
        quackBehavior = new FakeQuack();
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.println("RubberDuck.display() = I'm Rubber Duck");
    }

}
