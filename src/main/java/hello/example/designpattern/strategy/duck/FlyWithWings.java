package hello.example.designpattern.strategy.duck;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("날고 있어요!");
    }
}
