package hello.example.designpattern.factory.abstractfactory.computer.Impl;

import hello.example.designpattern.factory.abstractfactory.computer.Computer;
import hello.example.designpattern.factory.abstractfactory.computer.ElectronicsFactory;
import hello.example.designpattern.factory.abstractfactory.computer.Keyboard;

/**
 * ConcreteFactory2 : 구체적인 팩토리
 *
 * 데스크탑 컴퓨터와 기계식 키보드를 생성하는 구체적인 팩토리
 */
public class DesktopFactory implements ElectronicsFactory {
    @Override
    public Computer createComputer() {
        return new Desktop();
    }

    @Override
    public Keyboard createKeyboard() {
        return new MechanicaKeyboard();
    }
}
