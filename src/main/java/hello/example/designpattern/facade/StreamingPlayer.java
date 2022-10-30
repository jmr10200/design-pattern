package hello.example.designpattern.facade;

public class StreamingPlayer {
    String description;
    int currentChapter;
    Amplifier amplifier;
    String movie;

    public StreamingPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + " 전원 on");
    }

    public void off() {
        System.out.println(description + " 전원 off");
    }

    public void play(String movie) {
        this.movie = movie;
        currentChapter = 0;
        System.out.println(description + " playing \"" + movie + "\"");
    }

    public void stop() {
        currentChapter = 0;
        System.out.println(description + " 정지 \"" + movie + "\"");
    }

    public void pause() {
        System.out.println(description + " 일시중지 \"" + movie + "\"");
    }

    public void setTwoChannelAudio() {
        System.out.println(description + " set 2ch 스테레오 오디오");
    }

    public void setSurroundAudio() {
        System.out.println(description + " set 서라운드 오디오");
    }

    @Override
    public String toString() {
        return "StreamingPlayer{" +
                "description='" + description + '\'' +
                '}';
    }
}
