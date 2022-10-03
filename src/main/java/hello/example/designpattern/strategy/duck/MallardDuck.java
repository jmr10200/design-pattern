package hello.example.designpattern.strategy.duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        // 날 수 있음
        flyBehavior = new FlyWithWings();
        // 꽥
        quackBehavior = new Quack();
    }

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.println("MallardDuck.display() = I'm Mallard Duck");
    }
}
