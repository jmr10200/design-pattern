package hello.example.designpattern.factory.factorymethod.yuki;

import hello.example.designpattern.factory.factorymethod.yuki.framework.Factory;
import hello.example.designpattern.factory.factorymethod.yuki.framework.Product;
import hello.example.designpattern.factory.factorymethod.yuki.idcard.IDCardFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IDCardFactoryTest {

    @Test
    void main() {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Amy Kim");
        Product card2 = factory.create("Billy Park");
        Product card3 = factory.create("Carter Lee");
        card1.use();
        card2.use();
        card3.use();
    }

}