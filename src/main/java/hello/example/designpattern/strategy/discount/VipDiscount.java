package hello.example.designpattern.strategy.discount;

/**
 * ConcreteStrategy
 *
 * VIP 고객에게는 20% 할인
 */
public class VipDiscount implements DiscountStrategy {
    @Override
    public Double applyDiscount(Double amount) {
        return amount * 0.8;
    }
}
