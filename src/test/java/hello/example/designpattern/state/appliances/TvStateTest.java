package hello.example.designpattern.state.appliances;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvStateTest {

    @Test
    void main() {
        TvContext context = new TvContext();

        // TV를 켜고 끄는 상태 전환
        context.turnOff();
        context.turnOn();
        context.turnOn();
        context.turnOff();
        context.turnOn();
    }

}