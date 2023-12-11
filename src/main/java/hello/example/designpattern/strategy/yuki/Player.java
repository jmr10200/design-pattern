package hello.example.designpattern.strategy.yuki;

public class Player {
    private String name;
    private HandStrategy strategy;
    private int winCnt;
    private int loseCnt;
    private int gameCnt;

    // constructor : 이름과 전략을 받아 플레이어 생성
    public Player(String name, HandStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    // 전략에 따라 다음 손 결정
    public Hand nextHand() {
        return strategy.nextHand();
    }

    // win
    public void win() {
        strategy.study(true);
        winCnt++;
        gameCnt++;
    }

    // lose
    public void lose() {
        strategy.study(false);
        loseCnt++;
        gameCnt++;
    }

    // draw
    public void draw() {
        gameCnt++;
    }

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", winCnt=" + winCnt +
                ", loseCnt=" + loseCnt +
                ", gameCnt=" + gameCnt +
                ']';
    }
}
