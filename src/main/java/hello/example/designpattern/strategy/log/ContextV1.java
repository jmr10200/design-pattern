package hello.example.designpattern.strategy.log;

import lombok.extern.slf4j.Slf4j;

/**
 * Context(문맥)
 * 변하지 않는 로직을 가지고있음
 * 전략패턴에서 템플릿 역할
 */
@Slf4j
public class ContextV1 {

    private Strategy strategy;

    public ContextV1(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        Long startTime = System.currentTimeMillis();

        // 비즈니스 로직 실행
        strategy.algorithmInterface(); // 각 전략에 위임
        // 비즈니스 로직 종료

        Long endTime = System.currentTimeMillis();
        Long resultTime = endTime - startTime;
        log.info("resultTime = {}", resultTime);
    }
}
