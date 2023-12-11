package hello.example.designpattern.bridge.computer;

/**
 * RefinedAbstraction (컴퓨터 세부 기능)
 */
public class Desktop extends Computer {

    public Desktop(OperatingSystem os) {
        super(os);
    }

    @Override
    void useComputer() {
        System.out.println("Desktop 을 사용합니다.");
        os.installOS();
        os.runProgram();
    }

    void displayHighGraphic() {
        System.out.println("고성능 그래픽을 지원합니다.");
    }
}
