package hello.example.designpattern.templatecallback;

import lombok.extern.slf4j.Slf4j;

/**
 * 템플릿 콜백 패턴
 *
 * 전략패턴의 ContextV2 와 동일
 * 전략을 파라미터로 전달하는 방식
 *
 * 스프링에서는 이때 전달되는 Strategy 를 Callback 이라 칭한다.
 */
@Slf4j
public class TimeLogTemplate {

    public void execute(Callback callback) {
        long startTime = System.currentTimeMillis();
        // bizLogic 실행
        callback.call(); // 위임
        // bizLogic 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }
}
