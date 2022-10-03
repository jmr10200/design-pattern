package hello.example.designpattern.strategy.log;

import lombok.extern.slf4j.Slf4j;

/**
 * 전략을 파라미터로 전달받는 방식
 */
@Slf4j
public class ContextV2 {

    public void execute(Strategy strategy) {
        Long startTime = System.currentTimeMillis();

        // 비즈니스 로직 실행
        strategy.algorithmInterface(); // 각 전략에 위임
        // 비즈니스 로직 종료

        Long endTime = System.currentTimeMillis();
        Long resultTime = endTime - startTime;
        log.info("resultTime = {}", resultTime);
    }
}
