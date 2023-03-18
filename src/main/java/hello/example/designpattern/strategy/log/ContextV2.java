package hello.example.designpattern.strategy.log;

import lombok.extern.slf4j.Slf4j;

/**
 * 전략을 파라미터로 전달받는 방식
 *
 * 스프링에서 이러한 전략 패턴 방식을 "템플릿 콜백 패턴" 이라 한다.
 * Template Callback Pattern
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
