package hello.example.designpattern.observer.yuki;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    // 난수 생성기
    private Random random = new Random();
    // 현재 Number
    private int number;

    // Number 취득

    @Override
    public int getNumber() {
        return number;
    }

    // Number 생성
    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
