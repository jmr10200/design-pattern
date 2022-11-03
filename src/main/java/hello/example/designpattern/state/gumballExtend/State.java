package hello.example.designpattern.state.gumballExtend;

public interface State {

    void insertCoin();

    void ejectCoin();

    void turnCrank();

    void dispense();

    void refill();
}
