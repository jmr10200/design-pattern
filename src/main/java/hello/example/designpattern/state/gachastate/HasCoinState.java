package hello.example.designpattern.state.gachastate;

/**
 * 판매대기 상태 정보 : 동전 O
 */
public class HasCoinState implements State {

    GachaMachine gachaMachine;

    public HasCoinState(GachaMachine gachaMachine) {
        this.gachaMachine = gachaMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("동전을 넣을수 없어요. 이미 동전이 있습니다.");
    }

    @Override
    public void ejectCoin() {
        // 동전 반환
        System.out.println("동전을 반환합니다.");
        // 동전 반환 후 동전 없음 상태로 바꿔준다.
        gachaMachine.setState(gachaMachine.getNoCoinState());
    }

    @Override
    public void turnCrank() {
        // 손잡이 돌리기
        System.out.println("손잡이를 돌립니다.");
        // 손잡이 돌린 결과 : 뽑기 판매 시작
        gachaMachine.setState(gachaMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("뽑기 아직 나오지 않았어요.");
    }

    @Override
    public void refill() {

    }

    @Override
    public String toString() {
        return "판매대기 상태입니다 : 손잡이를 돌려야 뽑기가 나옵니다.";
    }
}
