package hello.example.designpattern.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeTheaterFacadeTest {

    @Test
    void homeTheaterPlayMovie() {
        Amplifier amplifier = new Amplifier("앰프");
        Tuner tuner = new Tuner("Am/Fm 튜너", amplifier);
        StreamingPlayer streamingPlayer = new StreamingPlayer("스트리밍 플레이어", amplifier);
        CdPlayer cdPlayer = new CdPlayer("CD 플레이어", amplifier);
        Projector projector = new Projector("프로젝터", streamingPlayer);
        TheaterLights theaterLights = new TheaterLights("조명 라이트");
        Screen screen = new Screen("스크린");
        PopcornPopper popcornPopper = new PopcornPopper("팝콘 팝팝!");

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, cdPlayer, popcornPopper, projector,
                screen, streamingPlayer, theaterLights, tuner);

        homeTheaterFacade.watchMovie("기생충");
        homeTheaterFacade.endMovie();
    }

    @Test
    void homeTheaterPlayRadio() {
        Amplifier amplifier = new Amplifier("골드 앰프");
        Tuner tuner = new Tuner("라디오 튜너", amplifier);
        StreamingPlayer streamingPlayer = new StreamingPlayer("재생 플레이어", amplifier);
        CdPlayer cdPlayer = new CdPlayer("CD player", amplifier);
        Projector projector = new Projector("콤팩트 프로젝터", streamingPlayer);
        TheaterLights theaterLights = new TheaterLights("휴대용 조명");
        Screen screen = new Screen("휴대용 스크린");
        PopcornPopper popcornPopper = new PopcornPopper("팝콘!");

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, cdPlayer, popcornPopper, projector,
                screen, streamingPlayer, theaterLights, tuner);

        homeTheaterFacade.listenToRadio(107.7);
        homeTheaterFacade.endRadio();
    }

}