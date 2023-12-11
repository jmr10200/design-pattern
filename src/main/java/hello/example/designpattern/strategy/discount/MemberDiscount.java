package hello.example.designpattern.strategy.discount;

/**
 * ConcreteStrategy
 *
 * 회원에게는 10% 할인 적용
 */
public class MemberDiscount implements DiscountStrategy {
    @Override
    public Double applyDiscount(Double amount) {
        return amount * 0.9;
    }
}
