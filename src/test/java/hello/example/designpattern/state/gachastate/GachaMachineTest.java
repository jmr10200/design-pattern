package hello.example.designpattern.state.gachastate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GachaMachineTest {

    @Test
    @DisplayName("state basic 테스트")
    void stateBasic() {
        // 검볼 1개짜리 자판기 생성
        GachaMachine gachaMachine = new GachaMachine(1);

        System.out.println(gachaMachine);

        // 1개 판매
        gachaMachine.insertCoin();
        gachaMachine.turnCrank();

        System.out.println(gachaMachine);

        // 1개 판매 : 매진으로 판매 불가
        gachaMachine.insertCoin();
        gachaMachine.turnCrank();

        // 3개 리필
        gachaMachine.refill(3);
        // 동전 넣기
        gachaMachine.insertCoin();
        // 동전 반환
        gachaMachine.ejectCoin();
        // 손잡이 돌리기
        gachaMachine.turnCrank();
        // 판매
        gachaMachine.insertCoin();
        gachaMachine.turnCrank();

        System.out.println(gachaMachine);
        Assertions.assertThat(gachaMachine.getCount()).isEqualTo(2);
        Assertions.assertThat(gachaMachine.state.getClass()).isEqualTo(NoCoinState.class);
    }

    @Test
    @DisplayName("리필 테스트")
    void refill() {
        // 2개 생성
        GachaMachine gachaMachine = new GachaMachine(2);

        System.out.println(gachaMachine); // 2개
        gachaMachine.insertCoin();
        gachaMachine.turnCrank();
        gachaMachine.insertCoin();
        gachaMachine.turnCrank(); // 2개 판매

        System.out.println(gachaMachine); // 0개 (매진)

        gachaMachine.refill(5); // 리필 5개
        gachaMachine.insertCoin();
        gachaMachine.turnCrank(); // 1게 판매 : 현재 4개

        gachaMachine.refill(6); // 리필 6개
        System.out.println(gachaMachine); // 10개

        // 10개 확인
        Assertions.assertThat(gachaMachine.getCount()).isEqualTo(10);

    }
}