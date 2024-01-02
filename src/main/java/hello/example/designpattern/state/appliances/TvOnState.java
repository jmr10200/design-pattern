package hello.example.designpattern.state.appliances;

/**
 * ConcreteState
 * Tv 가 켜져있는 상태
 */
public class TvOnState implements State {
    @Override
    public void turnOn() {
        System.out.println("TV 가 이미 켜져 있습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 를 끕니다.");
    }
}
