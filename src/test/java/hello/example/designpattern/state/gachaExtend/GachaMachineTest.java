package hello.example.designpattern.state.gachaExtend;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GachaMachineTest {

    @Test
    @DisplayName("랜덤 당첨 기능 추가")
    void winner() {
        // 5개 짜리 자판기 생성
        GachaMachine gachaMachine = new GachaMachine(10);

        // 1개씩 10번 뽑아가며 확인해보기
        for (int i = 0; i < 10; i++) {
            System.out.println(gachaMachine);
            gachaMachine.insertCoin();
            gachaMachine.turnCrank();
        }

    }

}