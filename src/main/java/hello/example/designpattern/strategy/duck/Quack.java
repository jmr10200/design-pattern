package hello.example.designpattern.strategy.duck;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("꽥");
    }
}
