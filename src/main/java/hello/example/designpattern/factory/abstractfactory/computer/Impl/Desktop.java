package hello.example.designpattern.factory.abstractfactory.computer.Impl;

import hello.example.designpattern.factory.abstractfactory.computer.Computer;

/**
 * ConcreteProductA2 : 전자제품 A2 의 구체적인 구현
 *
 * Computer 클래스 의 구체적인 구현 : Desktop
 */
public class Desktop implements Computer {
    @Override
    public void showInfo() {
        System.out.println("Desktop : 데스크탑 정보입니다");
    }
}
