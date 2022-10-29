package hello.example.designpattern.adapter.duck;

public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("MallardDuck 꽥");
    }

    public void fly() {
        System.out.println("MallardDuck 날고 있어요~");
    }
}