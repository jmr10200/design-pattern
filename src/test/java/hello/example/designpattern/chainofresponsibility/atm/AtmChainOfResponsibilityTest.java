package hello.example.designpattern.chainofresponsibility.atm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtmChainOfResponsibilityTest {


    @Test
    void main() {
        // 책임 연쇄 초기화 : 50,000 -> 10,000 -> 5,000 -> 1,000
        DispenseChain dispenser = new Won50000Dispenser();
        DispenseChain dispenser10 = new Won10000Dispenser();
        DispenseChain dispenser5 = new Won5000Dispenser();
        DispenseChain dispenser1 = new Won1000Dispenser();
        DispenseChain coins = new WonCoinDispenser();

        // 순서대로 책임 사슬
        dispenser.setNextChain(dispenser10);
        dispenser10.setNextChain(dispenser5);
        dispenser5.setNextChain(dispenser1);
        dispenser1.setNextChain(coins);

        WonTypeList wonList = new WonTypeList();

        Long amount = 1528700L;
        dispenser.dispense(amount, wonList);
        // 50,000원
        assertEquals(wonList.getFiftyThousandCnt(), amount / 50000);
        // 10,000원
        amount -= ((amount / 50000) * 50000);
        assertEquals(wonList.getTenThousandCnt(),amount / 10000);
        // 5,000원
        amount -= ((amount / 10000) * 10000);
        assertEquals(wonList.getFiveThousandCnt(),amount / 5000);
        // 1,000원
        amount -= ((amount / 5000) * 5000);
        assertEquals(wonList.getOneThousandCnt(), amount / 1000);
        // 잔액
        amount -= ((amount / 1000) * 1000);
        assertEquals(wonList.getCoins(),amount);
    }

}