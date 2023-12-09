package hello.example.designpattern.bridge.computer;

/**
 * ConcreteImplementor
 */
public class MacOS implements OperatingSystem {

    @Override
    public void installOS() {
        System.out.println("MacOS 를 설치합니다.");
    }

    @Override
    public void runProgram() {
        System.out.println("MacOs 를 실행합니다.");
    }
}
