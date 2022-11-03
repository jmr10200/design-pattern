package hello.example.designpattern.state.gumballstate;

public interface State {

    void insertCoin();

    void ejectCoin();

    void turnCrank();

    void dispense();

    void refill();
}
