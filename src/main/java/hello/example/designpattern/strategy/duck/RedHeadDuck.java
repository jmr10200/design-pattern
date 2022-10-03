package hello.example.designpattern.strategy.duck;


public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        // 날 수 있음
        flyBehavior = new FlyWithWings();
        // 꽥
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("RedHeadDuck.display() = I'm ReadHead Duck");
    }
}
