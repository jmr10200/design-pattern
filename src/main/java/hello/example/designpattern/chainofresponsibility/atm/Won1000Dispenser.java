package hello.example.designpattern.chainofresponsibility.atm;

/**
 * ConcreteHandler
 * 1,000 원 처리기
 */
public class Won1000Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Long amount, WonTypeList wonList) {
        if (amount >= 1000) {
            Long num = amount / 1000;
            Long remainder = amount % 1000;
            System.out.println("Dispensing " + num + " ₩1,000 won");
            wonList.setOneThousandCnt(num);
            if (remainder > 0) {
                nextChain.dispense(remainder, wonList);
            }
        } else {
            // 1,000원 처리기가 처리하지 못하면 넘김
            nextChain.dispense(amount, wonList);
        }
    }
}