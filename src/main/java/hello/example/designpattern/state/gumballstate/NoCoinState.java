package hello.example.designpattern.state.gumballstate;

/**
 * 판매대기 상태 정보 : 동전 X
 */
public class NoCoinState implements State {

    GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("동전을 넣습니다.");
        gumballMachine.setState(gumballMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("동전이 없습니다. 동전을 반환할 수 없어요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전이 없습니다. 손잡이를 돌려도 검볼이 나오지 않습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void refill() {

    }

    @Override
    public String toString() {
        return "판매대기 상태입니다 : 동전을 넣어주세요.";
    }
}
