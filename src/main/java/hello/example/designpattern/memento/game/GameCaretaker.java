package hello.example.designpattern.memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker
 * 게임 상태를 관리하는 클래스
 */
public class GameCaretaker {

    private List<GameStateMemento> mementoList = new ArrayList<>();

    public void saveGameState(GameStateMemento memento) {
        mementoList.add(memento);
    }

    public GameStateMemento restoreGameState(int index) {
        if (index >= 0 && index < mementoList.size()) {
            return mementoList.get(index);
        } else {
            return null;
        }
    }

    // 아래 메소드는 학습용
    public void savedGameStateList() {
        StringBuilder sb = new StringBuilder();
        sb.append("savedGameStateList (Level, Score) = ");
        for (GameStateMemento memento : mementoList) {
            sb.append("(");
            sb.append(memento.getLevel());
            sb.append(", ");
            sb.append(memento.getScore());
            sb.append(") ");
        }
        System.out.println(sb.toString());
    }
}
