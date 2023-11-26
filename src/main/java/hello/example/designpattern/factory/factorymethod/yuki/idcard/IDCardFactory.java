package hello.example.designpattern.factory.factorymethod.yuki.idcard;

import hello.example.designpattern.factory.factorymethod.yuki.framework.Factory;
import hello.example.designpattern.factory.factorymethod.yuki.framework.Product;

public class IDCardFactory extends Factory {

    private Long serialNumber = 1000L;

    @Override
    protected Product createProduct(String owner) { // 멀티스레드면 synchronized 필요하다
        return new IDCard(owner, serialNumber++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + " 을 등록했습니다.");
    }
}
