package hello.example.designpattern.strategy;

import hello.example.designpattern.strategy.log.ContextV2;
import hello.example.designpattern.strategy.log.Strategy;
import hello.example.designpattern.strategy.log.StrategyLogicA;
import hello.example.designpattern.strategy.log.StrategyLogicB;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV2Test {

    /**
     * 전략 패턴 적용
     */
    @Test
    void strategyV1() {
        ContextV2 context = new ContextV2();
        context.execute(new StrategyLogicA());
        context.execute(new StrategyLogicB());
    }

    /**
     * 전략 패턴 익명 내부 클래스
     */
    @Test
    void strategyV2() {
        ContextV2 context = new ContextV2();
        context.execute(new Strategy() {
            @Override
            public void algorithmInterface() {
                log.info("전략 인터페이스 구현 - A");
            }
        });
        context.execute(new Strategy() {
            @Override
            public void algorithmInterface() {
                log.info("전략 인터페이스 구현 - B");
            }
        });
    }

    /**
     * 전략 패턴 익명 내부 클래스2, 람다
     */
    @Test
    void strategyV3() {
        ContextV2 context = new ContextV2();
        context.execute(() -> log.info("전략 인터페이스 구현1"));
        context.execute(() -> log.info("전략 인터페이스 구현2"));
    }

}
