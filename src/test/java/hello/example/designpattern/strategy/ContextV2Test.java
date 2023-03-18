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
     *
     * 장점 : 실행할때마다 전략을 유연하게 변경할 수 있다.
     * 단점 : 실행할때마다 전략을 설정해줘야 한다는 것이다.
     *
     * 코드에 변하는 부분이 있고, 변하지 않는 부분이 있다.
     * 이를 템플릿화 했을때, 템플릿 안에서 일부분만 다른 코드를 실행하길 원한다.
     * 이 경우, ContextV2 방식으로, 실행할때 변하는 부분(전략)을 전달하는 것이 더 나은 방법일 수 있다.
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
