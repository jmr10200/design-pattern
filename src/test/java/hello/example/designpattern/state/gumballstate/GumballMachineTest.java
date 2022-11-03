package hello.example.designpattern.state.gumballstate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GumballMachineTest {

    @Test
    @DisplayName("state basic 테스트")
    void stateBasic() {
        // 검볼 1개짜리 자판기 생성
        GumballMachine gumballMachine = new GumballMachine(1);

        System.out.println(gumballMachine);

        // 1개 판매
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        // 1개 판매 : 매진으로 판매 불가
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        // 3개 리필
        gumballMachine.refill(3);
        // 동전 넣기
        gumballMachine.insertCoin();
        // 동전 반환
        gumballMachine.ejectCoin();
        // 손잡이 돌리기
        gumballMachine.turnCrank();
        // 판매
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        Assertions.assertThat(gumballMachine.getCount()).isEqualTo(2);
        Assertions.assertThat(gumballMachine.state.getClass()).isEqualTo(NoCoinState.class);
    }

    @Test
    @DisplayName("리필 테스트")
    void refill() {
        // 2개 생성
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println(gumballMachine); // 2개
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        gumballMachine.insertCoin();
        gumballMachine.turnCrank(); // 2개 판매

        System.out.println(gumballMachine); // 0개 (매진)

        gumballMachine.refill(5); // 리필 5개
        gumballMachine.insertCoin();
        gumballMachine.turnCrank(); // 1게 판매 : 현재 4개

        gumballMachine.refill(6); // 리필 6개
        System.out.println(gumballMachine); // 10개

        // 10개 확인
        Assertions.assertThat(gumballMachine.getCount()).isEqualTo(10);

    }
}