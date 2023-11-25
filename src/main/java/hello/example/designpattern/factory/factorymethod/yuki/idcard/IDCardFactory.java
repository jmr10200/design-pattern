package hello.example.designpattern.factory.factorymethod.yuki.idcard;

import hello.example.designpattern.factory.factorymethod.yuki.framework.Factory;
import hello.example.designpattern.factory.factorymethod.yuki.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + " 을 등록했습니다.");
    }
}
