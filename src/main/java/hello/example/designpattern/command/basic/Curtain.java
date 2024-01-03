package hello.example.designpattern.command.basic;

/**
 * Receiver
 */
public class Curtain {

    public Curtain() {
    }

    public void open() {
        System.out.println("커튼을 걷습니다.");
    }

    public void close() {
        System.out.println("커튼을 칩니다.");
    }

    public void halfOpen() {
        System.out.println("커튼을 반만 걷습니다.");
    }

    public void halfClose() {
        System.out.println("커튼을 반만 칩니다.");
    }
}
