package hello.example.designpattern.factory.factorymethod.yuki.idcard;

import hello.example.designpattern.factory.factorymethod.yuki.framework.Product;


public class IDCard extends Product {

    private String owner;
    private Long serialNumber;

    public IDCard(String owner, Long serialNumber) {
        System.out.println(owner + " 의 카드를 만듭니다. 시리얼 넘버는 [ " + serialNumber + " ] 입니다.");
        this.owner = owner;
        this.serialNumber = serialNumber;
    }

    @Override
    public void use() {
        System.out.println(this + " 을 사용합니다.");
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "owner = '" + owner + '\'' +
                ", serialNumber = " + serialNumber +
                '}';
    }

    public String getOwner() {
        return owner;
    }
}
