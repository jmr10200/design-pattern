package hello.example.designpattern.state.gumballExtend;

public class GumballMachine {

    State soldOutState; // 매진 상태
    State noCoinState; // 판매대기 상태 : 코인 없는 상태
    State hasCoinState; // 판매대기 상태 : 코인 넣어진 상태
    State soldState; // 판매중의 상태

    State winnerState; // 랜덤 당첨 상태

    State state;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinState;
        } else {
            state = soldOutState;
        }
    }

    public void insertCoin() {
        // 동전 넣음
        state.insertCoin();
    }

    public void ejectCoin() {
        // 동전 반환을 하면 반환
        state.ejectCoin();
    }

    public void turnCrank() {
        // 손잡이 돌림
        state.turnCrank();
        // 검볼 판매여부
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("검볼이 나왔습니다.");
        if (count > 0) {
            count = count - 1;
        }
    }

    public void refill(int count) {
        this.count += count;
        System.out.println("검볼 " + count + " 개 리필!, 현재 " + this.count + " 개 입니다.");
        state.refill();
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== Gumball Machine =====\n");
        sb.append("머신 상태 : " + state + "\n");
        sb.append("재고 : " + count + " 개\n");
        return sb.toString();
    }
}
