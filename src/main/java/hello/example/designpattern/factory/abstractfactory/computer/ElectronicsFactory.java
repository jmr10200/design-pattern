package hello.example.designpattern.factory.abstractfactory.computer;

/**
 * 추상 팩토리 인터페이스 : 컴퓨터, 키보드 생성
 *
 * AbstractFactory : 전자제품을 생성하는 추상 팩토리 인터페이스
 */
public interface ElectronicsFactory {
    Computer createComputer();

    Keyboard createKeyboard();
}
