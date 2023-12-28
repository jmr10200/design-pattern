package hello.example.designpattern.chainofresponsibility.atm;

/**
 * ConcreteHandler
 * 5,000 원 처리기
 */
public class Won5000Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Long amount, WonTypeList wonList) {
        if (amount >= 5000) {
            Long num = amount / 5000;
            Long remainder = amount % 5000;
            System.out.println("Dispensing " + num + " ₩5,000 won");
            wonList.setFiveThousandCnt(num);
            if (remainder > 0) {
                nextChain.dispense(remainder, wonList);
            }
        } else {
            // 5,000원 처리기가 처리하지 못하면 넘김
            nextChain.dispense(amount, wonList);
        }
    }
}

