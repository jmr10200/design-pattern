package hello.example.designpattern.decorator.message;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class DecoratorPatternClientTest {

    @Test
    void noDecorator() {
        Component realComponent = new RealComponent();
        DecoratorPatternClient client = new DecoratorPatternClient(realComponent);
        client.execute();
    }

    @Test
    void decorator() {
        Component realComponent = new RealComponent();
        Component messageComponent = new MessageDecorator(realComponent);
        DecoratorPatternClient client = new DecoratorPatternClient(messageComponent);
        client.execute();
    }

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