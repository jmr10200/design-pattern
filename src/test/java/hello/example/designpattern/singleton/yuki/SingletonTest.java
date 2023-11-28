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

    @Test
    void tripleMain() {
        System.out.println("== Start ==");

        Triple instance1 = Triple.getInstance("ALPHA");
        Triple instance2 = Triple.getInstance("BETA");
        Triple instance3 = Triple.getInstance("GAMMA");

        Triple instanceA = Triple.getInstance("ALPHA");
        Triple instanceB = Triple.getInstance("BETA");
        Triple instanceC = Triple.getInstance("DELTA");

        if (instance1 == instanceA) {
            System.out.println("instance1 == instanceA");
        } else {
            System.out.println("instance1 != instanceA");
        }

        if (instance2 == instanceB) {
            System.out.println("instance2 == instanceB");
        } else {
            System.out.println("instance2 != instanceB");
        }

        if (instance3 == instanceC) {
            System.out.println("instance3 == instanceC");
        } else {
            System.out.println("instance3 != instanceC");
        }

        System.out.println("== End ==");
    }

    @Test
    void trioMain() {
        System.out.println("== Start ==");

        Trio instance1 = Trio.getInstance("ALPHA");
        Trio instance2 = Trio.getInstance("BETA");
        Trio instance3 = Trio.getInstance("GAMMA");

        Trio instanceA = Trio.getInstance("ALPHA");
        Trio instanceB = Trio.getInstance("BETA");
        Trio instanceC = Trio.getInstance("DELTA");

        if (instance1 == instanceA) {
            System.out.println("instance1 == instanceA");
        } else {
            System.out.println("instance1 != instanceA");
        }

        if (instance2 == instanceB) {
            System.out.println("instance2 == instanceB");
        } else {
            System.out.println("instance2 != instanceB");
        }

        if (instance3 == instanceC) {
            System.out.println("instance3 == instanceC");
        } else {
            System.out.println("instance3 != instanceC");
        }

        System.out.println("== End ==");
    }

}