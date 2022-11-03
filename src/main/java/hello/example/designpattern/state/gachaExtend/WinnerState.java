package hello.example.designpattern.state.gachaExtend;

public class WinnerState implements State {

    GachaMachine gachaMachine;

    public WinnerState(GachaMachine gachaMachine) {
        this.gachaMachine = gachaMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("잠시만 기다려주세요. 뽑기가 나오고 있어요");
    }

    @Override
    public void ejectCoin() {
        System.out.println("잠시만 기다려주세요. 뽑기가 나오고 있어요");
    }

    @Override
    public void turnCrank() {
        System.out.println("돌린다고 뽑기가 더 나오지 않아요.");
    }

    @Override
    public void dispense() {
        // 뽑기 내보내기
        gachaMachine.releaseBall();
        if (gachaMachine.getCount() == 0) {
            // 뽑기 갯수가 0이면 : 매진 상태로
            gachaMachine.setState(gachaMachine.getSoldOutState());
        } else {
            // 뽑기 갯수가 0이 아니면 뽑기 내보내기
            gachaMachine.releaseBall();
            System.out.println("당첨!! 뽑기 한개 더");
            if (gachaMachine.getCount() > 0) {
                // 뽑기 내보낸 후 재고있으면 판매대기상태로
                gachaMachine.setState(gachaMachine.getNoCoinState());
            } else {
                // 뽑기 내보낸 후 재고 없으면 매진 상태로
                gachaMachine.setState(gachaMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill() {

    }

    @Override
    public String toString() {
        return "당첨!! 뽑기 1개 더!!";
    }
}


