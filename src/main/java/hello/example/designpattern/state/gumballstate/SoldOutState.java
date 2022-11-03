package hello.example.designpattern.state.gumballstate;

/**
 * 매진 상태 정보
 */
public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("매진입니다. 동전을 넣지마세요");
    }

    @Override
    public void ejectCoin() {
        System.out.println("넣은 동전이 없습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("검볼이 없습니다.");
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    @Override
    public String toString() {
        return "매진 상태입니다. sold out!!";
    }
}
