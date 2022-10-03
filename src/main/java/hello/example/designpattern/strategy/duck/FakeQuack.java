package hello.example.designpattern.strategy.duck;

public class FakeQuack implements QuackBehavior {
    public void quack() {
        System.out.println("꾸애액");
    }
}
