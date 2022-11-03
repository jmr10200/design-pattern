package hello.example.designpattern.state.gumballstate;

/**
 * 판매대기 상태 정보 : 동전 O
 */
public class HasCoinState implements State {

    GumballMachine gumballMachine;

    public HasCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
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
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    @Override
    public void turnCrank() {
        // 손잡이 돌리기
        System.out.println("손잡이를 돌립니다.");
        // 손잡이 돌린 결과 : 검볼 판매 시작
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("검볼 아직 나오지 않았어요.");
    }

    @Override
    public void refill() {

    }

    @Override
    public String toString() {
        return "판매대기 상태입니다 : 손잡이를 돌려야 검볼이 나옵니다.";
    }
}
