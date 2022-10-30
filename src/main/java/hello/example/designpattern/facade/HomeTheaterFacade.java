package hello.example.designpattern.facade;

public class HomeTheaterFacade {
    Amplifier amplifier;
    CdPlayer cdPlayer;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;
    StreamingPlayer streamingPlayer;
    TheaterLights theaterLights;
    Tuner tuner;

    public HomeTheaterFacade(Amplifier amplifier, CdPlayer cdPlayer, PopcornPopper popcornPopper, Projector projector, Screen screen, StreamingPlayer streamingPlayer, TheaterLights theaterLights, Tuner tuner) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.streamingPlayer = streamingPlayer;
        this.theaterLights = theaterLights;
        this.tuner = tuner;
    }

    public void watchMovie(String movie) {
        System.out.println("===== 영화 보기 =====");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer(streamingPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        streamingPlayer.on();
        streamingPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("===== 영화 끝 =====");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        streamingPlayer.stop();
        streamingPlayer.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("===== 라디오 듣기 =====");
        tuner.on();
        tuner.setFrequency(frequency);
        amplifier.on();
        amplifier.setVolume(6);
        amplifier.setTuner(tuner);
    }

    public void endRadio() {
        System.out.println("===== 라디오 종료 =====");
        tuner.off();
        amplifier.off();
    }
}
