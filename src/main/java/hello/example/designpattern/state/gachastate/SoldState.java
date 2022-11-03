package hello.example.designpattern.state.gachastate;

/**
 * 판매중 상태
 */
public class SoldState implements State {

    GachaMachine gachaMachine;

    public SoldState(GachaMachine gachaMachine) {
        this.gachaMachine = gachaMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("잠시만 기다려주세요. 지금 뽑기가 나오고 있습니다.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("죄송합니다. 이미 뽑기가 나오고있어 환불이 불가합니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("잠시만 기다려주세요. 이미 뽑기가 나오고 있습니다.");
    }

    @Override
    public void dispense() {
        // 뽑기 판매 처리
        gachaMachine.releaseBall();
        // 뽑기 판매 후 재고확인해서 상태를 바꿔준다.
        if (gachaMachine.getCount() > 0) {
            // 뽑기 재고가 있으면, 판매대기 상태
            gachaMachine.setState(gachaMachine.getNoCoinState());
        } else {
            // 뽑기 재고가 없으면, 매진 상태
            System.out.println("뽑기가 매진되었습니다.");
            gachaMachine.setState(gachaMachine.getSoldOutState());
        }
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "판매중 상태입니다 : 뽑기 판매중!";
    }
}
