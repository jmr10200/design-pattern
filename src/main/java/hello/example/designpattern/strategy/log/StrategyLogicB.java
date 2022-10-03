package hello.example.designpattern.strategy.log;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyLogicB implements Strategy {
    @Override
    public void algorithmInterface() {
        log.info("전략 인터페이스 구현 B");
    }
}
