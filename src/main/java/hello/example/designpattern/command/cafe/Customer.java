package hello.example.designpattern.command.cafe;

public class Customer {

    Clerk clerk;
    Make make;
    Order order;

    public Customer(Clerk clerk, Make make) {
        this.clerk = clerk;
        this.make = make;
    }

    public void createOrder(Order order) {
//        Order order = () -> {
//            make.makeIceAmericano();
//            make.makeCake();
//        };
        this.order = order;
    }

    public void hungry() {
        clerk.takeOrder(order);
    }
}
