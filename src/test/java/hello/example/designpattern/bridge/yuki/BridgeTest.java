package hello.example.designpattern.bridge.yuki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BridgeTest {

    @Test
    void displayMain() {
        Display display = new Display(new StringDisplayImpl("Hello String Display!"));
        display.display();
    }

    @Test
    void countDisplayMain() {
        Display display = new CountDisplay(new StringDisplayImpl("Hello Count Display!"));
        display.display();
    }

    @Test
    void multiDisplayMain() {
        CountDisplay display = new CountDisplay(new StringDisplayImpl("Hello Multi Display"));
        display.display();
        System.out.println("");
        display.multiDisplay(5);
    }
}