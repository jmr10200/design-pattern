package hello.example.designpattern.facade.audio;

public class CdPlayer {
    String description;
    int currentTrack;
    Amplifier amplifier;
    String title;

    public CdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void eject() {
        title = null;
        System.out.println(description + " eject");
    }

    public void play(String title) {
        this.title = title;
        currentTrack = 0;
        System.out.println(description + " playing \"" + title + "\"");
    }

    public void play(int track) {
        if (title == null) {
            System.out.println(description + " 재생 불가 " + currentTrack + " cd 없음");
        } else {
            currentTrack = track;
            System.out.println(description + " 재생 중 " + currentTrack);
        }
    }

    public void stop() {
        currentTrack = 0;
        System.out.println(description + " 정지!!");
    }

    public void pause() {
        System.out.println(description + " 일시정지 \"" + title + "\"");
    }

    @Override
    public String toString() {
        return "CdPlayer{" +
                "description='" + description + '\'' +
                '}';
    }
}
