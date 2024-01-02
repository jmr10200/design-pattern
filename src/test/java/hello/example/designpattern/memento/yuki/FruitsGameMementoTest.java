package hello.example.designpattern.memento.yuki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitsGameMementoTest {

    @Test
    void main() {
        // 최조 금액 100
        Gamer gamer = new Gamer(100);
        // 최초 상태 저장
        Memento memento = gamer.createMemento();

        // 게임 시작
        for (int i = 0; i < 30; i++) {
            // 횟수 표시
            System.out.println("==== " + i);
            // 현재 주인공의 상태 표시
            System.out.println("상태: " + gamer);

            // 게임 진행
            gamer.bet();

            System.out.println("소지금은 " + gamer.getMoney() + " 원 입니다.");

            // Memento 취급 방법 결정
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("※ 돈이 꽤 늘었으니 현재 상태 저장");
                memento = gamer.createMemento(); // 저장
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("※ 돈이 너무 줄었으니 이전 상태로 복원!!");
                gamer.restoreMemento(memento); // 복원
            }

            // 검사 대기
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }

}