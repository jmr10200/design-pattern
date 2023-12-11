package hello.example.designpattern.strategy.yuki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandStrategyTest {

    @Test
    void main() {
        int seed1 = 10;
        int seed2 = 45;
        // KIM, 전략: winning Strategy
        Player kim = new Player("KIM", new WinningStrategy(seed1));

        // LEE, 전략: Prob Strategy
        Player lee = new Player("LEE", new ProbStrategy(seed2));

        for (int i = 0; i < 5000; i++) {
            Hand kimHand = kim.nextHand();
            Hand leeHand = lee.nextHand();

            if (kimHand.isStrongerThan(leeHand)) {
                System.out.println("Winner is " + kim);
                kim.win();
                lee.lose();
            } else if (leeHand.isStrongerThan(kimHand)) {
                System.out.println("Winner is " + lee);
                kim.lose();
                lee.win();
            } else {
                System.out.println("Draw...");
                kim.draw();
                lee.draw();
            }
        }
        System.out.println("== Total Result ==");
        System.out.println(kim);
        System.out.println(lee);
    }

}