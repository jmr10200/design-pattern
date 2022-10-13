package hello.example.designpattern.command.cafe;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class CafeOrderTest {

    @Test
    void IceAndCake() {
        Make make = new Make();
        Clerk clerk = new Clerk();
        Customer customer = new Customer(clerk, make);
        customer.createOrder(new CoffeeAndCake(make));
        customer.hungry();
    }
}