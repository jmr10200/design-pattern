package hello.example.designpattern.chainofresponsibility.atm;

/**
 * ConcreteHandler
 * 50,000 원 처리기
 */
public class Won50000Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Long amount, WonTypeList wonList) {
        if (amount >= 50000) {
            Long num = amount / 50000;
            Long remainder = amount % 50000;
            System.out.println("Dispensing " + num + " ₩50,000 won");
            wonList.setFiftyThousandCnt(num);
            if (remainder > 0) {
                nextChain.dispense(remainder, wonList);
            }
        } else {
            // 이 5만원 처리기가 처리 할 수 없는 경우 다음 처리기에 넘긴다.
            nextChain.dispense(amount, wonList);
        }
    }
}
