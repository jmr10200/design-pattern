package hello.example.designpattern.state.gachastate;

public interface State {

    void insertCoin();

    void ejectCoin();

    void turnCrank();

    void dispense();

    void refill();
}
