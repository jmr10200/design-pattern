package hello.example.designpattern.strategy.discount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountStrategyTest {

    @Test
    void main() {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // 일반 고객
        paymentProcessor.setStrategy(new RegularDiscount());
        paymentProcessor.processPayment(100.0);

        // 회원
        paymentProcessor.setStrategy(new MemberDiscount());
        paymentProcessor.processPayment(100.0);

        // VIP
        paymentProcessor.setStrategy(new VipDiscount());
        paymentProcessor.processPayment(100.0);
    }
}