package hello.example.designpattern.factory.abstractfactory.computer;

import hello.example.designpattern.factory.abstractfactory.computer.Impl.DesktopFactory;
import hello.example.designpattern.factory.abstractfactory.computer.Impl.LaptopFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 클라이언트 (테스트 클래스로 갈음)
 * 추상 팩토리를 이용해 전자제품을 생성하고 사용
 */
class ComputerFactoryTest {

    @Test
    @DisplayName("랩탑 생성")
    void laptop() {
        // 팩토리 선택 : 랩탑 팩토리
        ElectronicsFactory factory1 = new LaptopFactory();

        // 제품 생성
        Computer computer1 = factory1.createComputer();
        Keyboard keyboard1 = factory1.createKeyboard();

        // 제품 사용
        computer1.showInfo();
        keyboard1.info();
    }

    @Test
    @DisplayName("데스크탑 생성")
    void desktop() {
        // 팩토리 선택 : 데스크탑 팩토리
        ElectronicsFactory factory2 = new DesktopFactory();

        // 제품 생성
        Computer computer2 = factory2.createComputer();
        Keyboard keyboard2 = factory2.createKeyboard();

        // 제품 사용
        computer2.showInfo();
        keyboard2.info();
    }
}