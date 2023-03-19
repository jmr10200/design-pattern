package hello.example.designpattern.decorator.message;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * 데코레이터 패턴
 * 의도(intent) : "객체에 추가 책임(기능)을 동적으로 추가"하고, 기능 확장을 위한 유연한 대안 제공
 *
 * 참고 : 프록시 패턴과 유사하지만 "의도(intent)"에 따라 구분한다.
 */
@Slf4j
class DecoratorPatternClientTest {

    /**
     * client -> realComponent 의존관계
     */
    @Test
    void noDecorator() {
        Component realComponent = new RealComponent();
        DecoratorPatternClient client = new DecoratorPatternClient(realComponent);
        client.execute();
    }

    /**
     * 프록시로 부가 기능을 추가하는 것 : 데코레이터 패턴
     * MessageDecorator : 메세지를 꾸며주는 부가기능 추가
     *
     * client -> MessageDecorator -> realComponent 의존 관계
     */
    @Test
    void decorator1() {
        Component realComponent = new RealComponent();
        Component messageComponent = new MessageDecorator(realComponent);
        DecoratorPatternClient client = new DecoratorPatternClient(messageComponent);
        client.execute();
    }

    /**
     * 메세지 꾸며주는 기능에 실행시간 측정 기능도 추가
     * TimeDecorator : 실행 시간을 측정하는 부가기능 추가
     *
     * client -> TimeDecorator -> MessageDecorator -> realComponent 의존관계
     */
    @Test
    void decorator2() {
        Component realComponent = new RealComponent();
        Component messageComponent = new MessageDecorator(realComponent);
        Component timeComponent = new TimeDecorator(messageComponent);
        DecoratorPatternClient client = new DecoratorPatternClient(timeComponent);
        client.execute();
    }

    @Test
    void decorator3() {
        Component component = new RealComponent();
        component = new MessageDecorator(component);
        component = new TimeDecorator(component);
        DecoratorPatternClient client = new DecoratorPatternClient(component);
        client.execute();
    }
}