package hello.example.designpattern.facade.audio;

public class Projector {
    String description;
    StreamingPlayer player;

    public Projector(String description, StreamingPlayer player) {
        this.description = description;
        this.player = player;
    }

    public void on() {
        System.out.println(description + " 전원 on");
    }

    public void off() {
        System.out.println(description + " 전원 off");
    }

    public void wideScreenMode() {
        System.out.println(description + " 와이드 스크린 모드 (16x9)");
    }

    public void tvMode() {
        System.out.println(description + " tv 모드 (4x3)");
    }

    @Override
    public String toString() {
        return "Projector{" +
                "description='" + description + '\'' +
                '}';
    }
}
