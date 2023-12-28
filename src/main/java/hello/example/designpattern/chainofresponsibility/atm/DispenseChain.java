package hello.example.designpattern.chainofresponsibility.atm;

/**
 * 처리자(Handler) 인터페이스
 */
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Long amount, WonTypeList wonList);
}
