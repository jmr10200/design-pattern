package hello.example.designpattern.state.gumballExtend;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GumballMachineTest {

    @Test
    @DisplayName("랜덤 당첨 기능 추가")
    void winner() {
        // 5개 짜리 자판기 생성
        GumballMachine gumballMachine = new GumballMachine(10);

        // 1개씩 10번 뽑아가며 확인해보기
        for (int i = 0; i < 10; i++) {
            System.out.println(gumballMachine);
            gumballMachine.insertCoin();
            gumballMachine.turnCrank();
        }

    }

}