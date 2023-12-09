package hello.example.designpattern.factory.abstractfactory.computer.Impl;

import hello.example.designpattern.factory.abstractfactory.computer.Computer;

/**
 * ConcreteProductA1 : 전자제품 A1 의 구체적인 구현
 *
 * Computer 클래스 의 구체적인 구현 : Laptop
 */
public class Laptop implements Computer {
    @Override
    public void showInfo() {
        System.out.println("Laptop : 휴대용 컴퓨터 입니다");
    }
}
