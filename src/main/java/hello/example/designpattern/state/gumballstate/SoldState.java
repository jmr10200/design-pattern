package hello.example.designpattern.state.gumballstate;

/**
 * 판매중 상태
 */
public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("잠시만 기다려주세요. 지금 검볼이 나오고 있습니다.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("죄송합니다. 이미 검볼이 나오고있어 환불이 불가합니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("잠시만 기다려주세요. 이미 검볼이 나오고 있습니다.");
    }

    @Override
    public void dispense() {
        // 검볼 판매 처리
        gumballMachine.releaseBall();
        // 검볼 판매 후 재고확인해서 상태를 바꿔준다.
        if (gumballMachine.getCount() > 0) {
            // 검볼 재고가 있으면, 판매대기 상태
            gumballMachine.setState(gumballMachine.getNoCoinState());
        } else {
            // 검볼 재고가 없으면, 매진 상태
            System.out.println("검볼이 매진되었습니다.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "판매중 상태입니다 : 검볼 판매중!";
    }
}
