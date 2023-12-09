package hello.example.designpattern.factory.abstractfactory.computer.Impl;

import hello.example.designpattern.factory.abstractfactory.computer.Computer;
import hello.example.designpattern.factory.abstractfactory.computer.ElectronicsFactory;
import hello.example.designpattern.factory.abstractfactory.computer.Keyboard;

/**
 * ConcreteFactory1 : 구체적인 팩토리
 *
 * 랩탑 컴퓨터와 멤브레인 키보드를 생성하는 구체적인 팩토리
 */
public class LaptopFactory implements ElectronicsFactory {
    @Override
    public Computer createComputer() {
        return new Laptop();
    }

    @Override
    public Keyboard createKeyboard() {
        return new MembraneKeyboard();
    }
}
