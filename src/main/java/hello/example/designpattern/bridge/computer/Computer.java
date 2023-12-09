package hello.example.designpattern.bridge.computer;

/**
 * Abstraction
 */
public abstract class Computer {

    protected OperatingSystem os;

    public Computer(OperatingSystem os) {
        this.os = os;
    }

    abstract void useComputer();
}
