package hello.example.designpattern.strategy.discount;

/**
 * ConcreteStrategy
 *
 * 비회원 할인 미적용
 */
public class RegularDiscount implements DiscountStrategy {
    @Override
    public Double applyDiscount(Double amount) {
        return amount;
    }
}
