package hello.example.designpattern.factory.abstractfactory.computer.Impl;

import hello.example.designpattern.factory.abstractfactory.computer.Keyboard;

/**
 * ConcreteProductB2 : 전자제품 B2 의 구체적인 구현
 *
 * Keyboard 클래스 의 구체적인 구현 : MembraneKeyboard
 */
public class MembraneKeyboard implements Keyboard {
    @Override
    public void info() {
        System.out.println("멤프레인 키보드");
    }
}
