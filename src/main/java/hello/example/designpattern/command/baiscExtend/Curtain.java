package hello.example.designpattern.command.baiscExtend;

public class Curtain {

    public static final int OPEN = 0;
    public static final int HALF_OPEN = 1;
    public static final int CLOSE = 2;

    String location;
    int level;

    public Curtain(String location) {
        this.location = location;
        level = OPEN;
    }

    public void open() {
        level = OPEN;
        System.out.println("커튼을 걷습니다.");
    }

    public void close() {
        level = CLOSE;
        System.out.println("커튼을 칩니다.");
    }

    public void halfOpen() {
        level = HALF_OPEN;
        System.out.println("커튼을 반만 칩니다.");
    }

    public int getLevel() {
        return level;
    }
}
