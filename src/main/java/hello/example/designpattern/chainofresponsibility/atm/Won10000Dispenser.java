package hello.example.designpattern.chainofresponsibility.atm;

/**
 * ConcreteHandler
 * 10,000 원 처리기
 */
public class Won10000Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Long amount, WonTypeList wonList) {
        if (amount >= 10000) {
            Long num = amount / 10000;
            Long remainder = amount % 10000;
            System.out.println("Dispensing " + num + " ₩10,000 won");
            wonList.setTenThousandCnt(num);
            if (remainder > 0) {
                nextChain.dispense(remainder, wonList);
            }
        } else {
            // 10,000원 처리기가 처리하지 못하면 넘김
            nextChain.dispense(amount, wonList);
        }
    }
}
