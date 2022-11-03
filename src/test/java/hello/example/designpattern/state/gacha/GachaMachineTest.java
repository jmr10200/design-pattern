package hello.example.designpattern.state.gacha;

import org.junit.jupiter.api.Test;

class GachaMachineTest {

    @Test
    void exampleTest() {
        GachaMachine gachaMachine = new GachaMachine(5);

        System.out.println(gachaMachine);

        gachaMachine.insertCoin();
        gachaMachine.turnCrank();

        System.out.println(gachaMachine);

        gachaMachine.insertCoin();
        gachaMachine.ejectCoin();
        gachaMachine.turnCrank();

        System.out.println(gachaMachine);

        gachaMachine.insertCoin();
        gachaMachine.turnCrank();
        gachaMachine.insertCoin();
        gachaMachine.turnCrank();
        gachaMachine.ejectCoin();

        System.out.println(gachaMachine);

        gachaMachine.insertCoin();
        gachaMachine.insertCoin();
        gachaMachine.turnCrank();
        gachaMachine.insertCoin();
        gachaMachine.turnCrank();
        gachaMachine.insertCoin();
        gachaMachine.turnCrank();

        System.out.println(gachaMachine);
    }

}