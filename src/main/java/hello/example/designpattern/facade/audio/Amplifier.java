package hello.example.designpattern.facade.audio;

public class Amplifier {
    String description;
    Tuner tuner;
    StreamingPlayer player;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " 전원 on");
    }

    public void off() {
        System.out.println(description + " 전원 off");
    }

    public void setStereoSound() {
        System.out.println(description + " 스테레오 모드 on");
    }

    public void setSurroundSound() {
        System.out.println(description + " 서라운드 모드 on");
    }

    public void setVolume(int level) {
        System.out.println(description + " 볼륨 설정 " + level);
    }

    public void setTuner(Tuner tuner) {
        System.out.println(description + " 튜너 설정 " + tuner);
        this.tuner = tuner;
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println(description + " set 스트리밍 플레이어 " + player);
        this.player = player;
    }

    @Override
    public String toString() {
        return "Amplifier{" +
                "description='" + description + '\'' +
                '}';
    }
}
