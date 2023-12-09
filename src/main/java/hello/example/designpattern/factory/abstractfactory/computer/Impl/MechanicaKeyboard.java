package hello.example.designpattern.factory.abstractfactory.computer.Impl;

import hello.example.designpattern.factory.abstractfactory.computer.Keyboard;

/**
 * ConcreteProductB1 : 전자제품 B1 의 구체적인 구현
 *
 * Keyboard 클래스 의 구체적인 구현 : MechanicaKeyboard
 */
public class MechanicaKeyboard implements Keyboard {
    @Override
    public void info() {
        System.out.println("기계식 키보");
    }
}
