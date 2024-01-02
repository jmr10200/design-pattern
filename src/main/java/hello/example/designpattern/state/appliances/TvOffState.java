package hello.example.designpattern.state.appliances;

/**
 * ConcreteState
 * Tv 가 꺼져있는 상태
 */
public class TvOffState implements State {
    @Override
    public void turnOn() {
        System.out.println("TV 를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 가 이미 꺼져 있습니다.");
    }
}