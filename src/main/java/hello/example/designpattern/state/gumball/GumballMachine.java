package hello.example.designpattern.state.gumball;

public class GumballMachine {
    // 각 상태를 저장하기위한 인스턴스변수를 만들어 정의
    final static int SOLD_OUT = 0; // 매진
    final static int NO_QUARTER = 1; // 동전 없음
    final static int HAS_QUARTER = 2; // 동전 있음
    final static int SOLD = 3; // 판매

    int state = SOLD_OUT; // 현재 상태를 저장하는 인스턴스 변수
    int count = 0; // 검볼 갯수

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전이 이미 있어요. 더 넣을 수 없어요.");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣었습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("sold out! 다 팔렸어요. 돈 넣지마세요");
        } else if (state == SOLD) {
            System.out.println("Please wait, 검볼이 나올거에요");
        }
    }

    public void ejectQuarter() { // 사용자가 동전 반환 하는 경우
        if (state == HAS_QUARTER) {
            System.out.println("동전 반환");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("동전이 없어요");
        } else if (state == SOLD) {
            System.out.println("이미 구입 하셨어요");
        } else if (state == SOLD_OUT) {
            System.out.println("동전 반환 안돼요. 매진으로 돈도 안받았어요");
        }
    }

    public void turnCrank() { // 사용자가 손잡이를 돌리는 경우
        if (state == SOLD) {
            System.out.println("손잡이는 한 번만 돌려주세요.");
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요");
        } else if (state == SOLD_OUT) {
            System.out.println("매진 되었습니다");
        } else if (state == HAS_QUARTER) {
            System.out.println("손잡이를 돌렸습니다.");
            state = SOLD;
            dispense();
        }
    }

    private void dispense() {
        if (state == SOLD) {
            System.out.println("검볼이 나가고 있어요");
            count = count - 1;
            if (count == 0) {
                System.out.println("검볼이 없어요");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("먼저 동전을 넣어주세요");
        } else if (state == SOLD_OUT) {
            System.out.println("매진 입니다.");
        } else if (state == HAS_QUARTER) {
            System.out.println("검볼이 나갈 수 없어요.");
        }
    }
    // 이하 삭제
    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n(주) 검볼머신");
        result.append("\n모델명 gb1010\n");
        result.append("재고 : " + count + "  개");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n현재 기계 상태는 ");
        if (state == SOLD_OUT) {
            result.append("sold out!!");
        } else if (state == NO_QUARTER) {
            result.append("동전 넣어주세요");
        } else if (state == HAS_QUARTER) {
            result.append("손잡이를 돌려주세요");
        } else if (state == SOLD) {
            result.append("검볼이 나오고 있습니다.");
        }
        result.append("\n");
        return result.toString();
    }
}