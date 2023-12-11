package hello.example.designpattern.bridge.computer;

/**
 * RefinedAbstraction (컴퓨터 세부 기능)
 */
public class Laptop extends Computer {

    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    void useComputer() {
        System.out.println("Laptop 을 사용합니다.");
        os.installOS();
        os.runProgram();
    }

    void folding() {
        System.out.println("Laptop 을 접어서 사용합니다.");
    }
}
