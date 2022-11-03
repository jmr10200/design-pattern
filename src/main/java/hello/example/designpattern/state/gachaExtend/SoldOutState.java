package hello.example.designpattern.state.gachaExtend;

/**
 * 매진 상태 정보
 */
public class SoldOutState implements State {

    GachaMachine gachaMachine;

    public SoldOutState(GachaMachine gachaMachine) {
        this.gachaMachine = gachaMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("매진입니다.");
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
        System.out.println("뽑기가 없습니다.");
    }

    @Override
    public void refill() {
        gachaMachine.setState(gachaMachine.getNoCoinState());
    }

    @Override
    public String toString() {
        return "매진 상태입니다. sold out!!";
    }
}
