package hello.example.designpattern.strategy.log;

import lombok.extern.slf4j.Slf4j;

/**
 * 전략을 파라미터로 전달받는 방식
 *
 * 스프링에서 이러한 전략 패턴 방식을 "템플릿 콜백 패턴" 이라 한다.
 * Template Callback Pattern
 *
 * ContextV2 는 변하지 않는 템플릿 역할을 한다.
 * 변하는 부분은 파라미터로 넘어온 Strategy 의 코드를 실행해서 처리한다.
 * 이때 파라미터로 넘겨주는 실행 가능한 코드를 콜백(callback) 이라 한다.
 *
 * 코드가 호츨 (call) 되는데 코드를 넘겨준 곳의 뒤 (back) 에서 실행된다는 의미
 * ContextV2 예제에서 콜백 : Strategy
 * -> templatecallback 패키지 참조
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
