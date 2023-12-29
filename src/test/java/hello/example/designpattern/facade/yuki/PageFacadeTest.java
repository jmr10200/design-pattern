package hello.example.designpattern.facade.yuki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PageFacadeTest {

    @Test
    void main() {
        PageMaker.makeWelcomePage("gym@example.com", "welcome.html");
    }

}