package hello.example.designpattern.chainofresponsibility.atm;

/**
 * ConcreteHandler
 * 동전 처리기
 */
public class WonCoinDispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Long amount, WonTypeList wonList) {
        // 처리 못한 잔액은 남김
        System.out.println("Dispensing " + amount + " Coins");
        wonList.setCoins(amount);
    }
}