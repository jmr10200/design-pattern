package hello.example.designpattern.command.cafe;

public class CoffeeAndCake implements Order {

    Make make;

    public CoffeeAndCake(Make make) {
        this.make = make;
    }

    @Override
    public void orderUp() {
        make.makeIceAmericano();
        make.makeCake();
    }
}
