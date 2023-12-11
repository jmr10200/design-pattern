package hello.example.designpattern.strategy.discount;

/**
 * ConcreteStrategy
 *
 * 일반 고객에게는 할인 미적용
 */
public class RegularDiscount implements DiscountStrategy {
    @Override
    public Double applyDiscount(Double amount) {
        return amount;
    }
}
