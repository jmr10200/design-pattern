package hello.example.designpattern.observer.forecast;

/**
 * ConcreteObserver 구체적인 옵저버
 */
public class TemperatureDisplay implements Observer {
    private int temperature;

    /**
     * ConcreteObserver 의 역할
     * Subject 로부터 상태 변경 알림을 받아 처리한다.
     */
    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("현재 기온: " + temperature + " 도 입니다.");
    }
}

