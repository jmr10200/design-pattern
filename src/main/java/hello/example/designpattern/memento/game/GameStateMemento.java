package hello.example.designpattern.memento.game;

/**
 * Memento
 * 게임 상태를 저장하는 클래스
 */
public class GameStateMemento {

    private int level;
    private int score;

    public GameStateMemento(int level, int score) {
        this.level = level;
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}
