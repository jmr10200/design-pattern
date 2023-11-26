package hello.example.designpattern.singleton.yuki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void main() {
        System.out.println("== Start ==");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if (instance1 == instance2) {
            System.out.println("인스턴스1 과 인스턴스2 는 같은 인스턴스입니다.");
        } else {
            System.out.println("인스턴스1 과 인스턴스2 는 같은 인스턴스가 아닙니다.");
        }
        System.out.println("== End ==");
    }

    @Test
    void ticketMakerMain() {
        System.out.println("== Ticket Maker Start ==");
        TicketMaker obj1 = TicketMaker.getInstance();
        for (int i = 0; i < 10; i++) {
            System.out.println(obj1.getNextTicketNumber());
        }
        System.out.println("== Ticket Maker End ==");
    }

}