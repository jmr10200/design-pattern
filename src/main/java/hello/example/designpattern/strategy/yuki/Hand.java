package hello.example.designpattern.strategy.yuki;

public enum Hand {

    // 가위 바위 보를 나타내는 세 개의 Enum 상수
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2),
    ;

    // 필드
    private String name;
    private int handValue;

    private static Hand[] hands = {
            ROCK, SCISSORS, PAPER
    };

    // constructor
    Hand(String name, int handValue) {
        this.name = name;
        this.handValue = handValue;
    }

    // getter
    public static Hand getHands(int handValue) {
        return hands[handValue];
    }

    // this > h 면 true
    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    // this < h 면 false
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    // 무승부 0, this 이기면 1, h 이기면 -1
    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    // 가위바위보 문자로 표기
    @Override
    public String toString() {
        return name;
    }
}
