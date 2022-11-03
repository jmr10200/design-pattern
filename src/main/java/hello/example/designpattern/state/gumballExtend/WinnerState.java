package hello.example.designpattern.state.gumballExtend;

public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("잠시만 기다려주세요. 검볼이 나오고 있어요");
    }

    @Override
    public void ejectCoin() {
        System.out.println("잠시만 기다려주세요. 검볼이 나오고 있어요");
    }

    @Override
    public void turnCrank() {
        System.out.println("돌린다고 검볼 나오지 않아요.");
    }

    @Override
    public void dispense() {
        // 검볼 내보내기
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            // 검볼 갯수가 0이면 : 매진 상태로
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            // 검볼 갯수가 0이 아니면 검볼 내보내기
            gumballMachine.releaseBall();
            System.out.println("당첨!! 검볼 한개 더");
            if (gumballMachine.getCount() > 0) {
                // 검볼 내보낸 후 재고있으면 판매대기상태로
                gumballMachine.setState(gumballMachine.getNoCoinState());
            } else {
                // 검볼 내보낸 후 재고 없으면 매진 상태로
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill() {

    }

    @Override
    public String toString() {
        return "당첨!! 검볼 1개 더!!";
    }
}


