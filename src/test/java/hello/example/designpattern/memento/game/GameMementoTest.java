package hello.example.designpattern.memento.game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GameMementoTest {

    @Test
    void main() {
        Player player = new Player();
        GameCaretaker caretaker = new GameCaretaker();

        int saveCount = 0; // 저장한 수
        int expectedLevel = 0;
        int expectedScore = 0;

        // 게임 플레이 10회 후 상태 저장
        for (int i = 0; i < 10; i++) {
            player.playGame();
            if (i % 2 != 0) { // 짝수 레벨만 저장
                caretaker.saveGameState(player.saveGame());
                saveCount++;
                if (saveCount == 2) {
                    expectedLevel = player.getLevel();
                    expectedScore = player.getScore();
                }
            }
        }

        // 두번째 저장한 상태 불러오기
        GameStateMemento savedGame = caretaker.restoreGameState(1);
        if (savedGame != null) {
            player.loadGame(savedGame);
        }
        Assertions.assertThat(savedGame.getLevel()).isEqualTo(expectedLevel);
        Assertions.assertThat(savedGame.getScore()).isEqualTo(expectedScore);

        // 저장된 게임 리스트 출력
        System.out.println();
        caretaker.savedGameStateList();
    }

}