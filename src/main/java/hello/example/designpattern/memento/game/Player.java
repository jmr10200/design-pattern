package hello.example.designpattern.memento.game;

/**
 * Originator
 * Player 의 상태를 저장하고 복원하는 클래스
 */
public class Player {

    private int level;
    private int score;

    public void playGame() {
        level++;
        score += 10;
        System.out.println("level = " + level + ", Score = " + score);
    }

    // 저장
    public GameStateMemento saveGame() {
        return new GameStateMemento(level, score);
    }

    // 복원
    public void loadGame(GameStateMemento memento) {
        this.level = memento.getLevel();
        this.score = memento.getScore();
        System.out.println("저장된 게임을 불러왔습니다. Level = " + level + ", Score = " + score);
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}
