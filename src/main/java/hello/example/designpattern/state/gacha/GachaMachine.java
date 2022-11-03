package hello.example.designpattern.state.gacha;

public class GachaMachine {
    // 각 상태를 저장하기위한 인스턴스변수를 만들어 정의
    final static int SOLD_OUT = 0; // 매진
    final static int NO_COIN = 1; // 동전 없음
    final static int HAS_COIN = 2; // 동전 있음
    final static int SOLD = 3; // 판매

    int state = SOLD_OUT; // 현재 상태를 저장하는 인스턴스 변수
    int count = 0; // 뽑기 갯수

    public GachaMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_COIN;
        }
    }

    public void insertCoin() {
        if (state == HAS_COIN) {
            // 판매대기 상태 : 동전 O
            System.out.println("동전이 이미 있어요. 더 넣을 수 없어요.");
        } else if (state == NO_COIN) {
            // 판매대기 상태 : 동전 X
            state = HAS_COIN;
            System.out.println("동전을 넣었습니다.");
        } else if (state == SOLD_OUT) {
            // 매진 상태
            System.out.println("sold out! 다 팔렸어요. 돈 넣지마세요");
        } else if (state == SOLD) {
            // 판매중 상태
            System.out.println("잠시만 기다려주세요. 뽑기가 나올거에요");
        }
    }

    public void ejectCoin() { // 사용자가 동전 반환 하는 경우
        if (state == HAS_COIN) {
            // 판매대기 : 동전 O, 반환 O
            System.out.println("동전이 반환됩니다.");
            state = NO_COIN;
        } else if (state == NO_COIN) {
            // 판매대기 : 동전 X, 반환 X
            System.out.println("동전이 없어요");
        } else if (state == SOLD) {
            // 판매중 : 이미 판매되어 반환 X
            System.out.println("이미 구입 하셨어요");
        } else if (state == SOLD_OUT) {
            // 매진 : 동전 X, 반환 X
            System.out.println("동전 반환 안돼요. 매진으로 돈도 안받았어요");
        }
    }

    public void turnCrank() { // 사용자가 손잡이를 돌리는 경우
        if (state == SOLD) {
            System.out.println("손잡이는 한 번만 돌려주세요.");
        } else if (state == NO_COIN) {
            System.out.println("동전을 넣어주세요");
        } else if (state == SOLD_OUT) {
            System.out.println("매진 되었습니다");
        } else if (state == HAS_COIN) {
            System.out.println("손잡이를 돌렸습니다. 뽑기가 나올거에요");
            state = SOLD;
            dispense();
        }
    }

    private void dispense() {
        if (state == SOLD) {
            System.out.println("뽑기가 나가고 있어요");
            count = count - 1;
            if (count == 0) {
                System.out.println("뽑기 재고가 없어요");
                state = SOLD_OUT;
            } else {
                state = NO_COIN;
            }
        } else if (state == NO_COIN) {
            System.out.println("먼저 동전을 넣어주세요");
        } else if (state == SOLD_OUT) {
            System.out.println("매진 입니다.");
        } else if (state == HAS_COIN) {
            System.out.println("뽑기가 나갈 수 없어요.");
        }
    }
    // 이하 삭제
    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_COIN;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("==== 뽑기 자판기 ==== \n");
        result.append("재고 : " + count + "  개");
        result.append("\n현재 자판기 상태는 ");
        if (state == SOLD_OUT) {
            result.append("매진 : sold out!!");
        } else if (state == NO_COIN) {
            result.append("판매대기(돈 X) : 동전 넣어주세요");
        } else if (state == HAS_COIN) {
            result.append("판매대기(돈 O) : 손잡이를 돌려주세요");
        } else if (state == SOLD) {
            result.append("판매중 : 뽑기가 나오고 있습니다.");
        }
        result.append("\n");
        return result.toString();
    }
}