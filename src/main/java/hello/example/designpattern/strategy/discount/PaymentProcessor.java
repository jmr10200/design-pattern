package hello.example.designpattern.strategy.discount;

/**
 * Context
 */
public class PaymentProcessor {
    private DiscountStrategy strategy;

    // setter
    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public Double processPayment(Double amount) {
        Double discountedAmount = strategy.applyDiscount(amount);
        System.out.println("Amount: ₩" + amount + " , Discounted Amount: ₩" + discountedAmount);
        return discountedAmount;
    }
}
