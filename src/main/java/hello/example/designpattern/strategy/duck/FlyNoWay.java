package hello.example.designpattern.strategy.duck;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("못 날아요!");
    }
}
