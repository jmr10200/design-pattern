package hello.example.designpattern.command.cafe;

public class Clerk {

    Order order;

    public Clerk() {
    }

    public void takeOrder(Order order) {
        this.order = order;
        order.orderUp();
    }
}
