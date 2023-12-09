package hello.example.designpattern.bridge.computer;

/**
 * ConcreteImplementor
 */
public class Windows implements OperatingSystem {

    @Override
    public void installOS() {
        System.out.println("Windows 를 설치합니다.");
    }

    @Override
    public void runProgram() {
        System.out.println("Windows 를 실행합니다.");
    }
}
