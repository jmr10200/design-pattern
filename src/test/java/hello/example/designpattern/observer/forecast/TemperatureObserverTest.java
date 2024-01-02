package hello.example.designpattern.observer.forecast;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureObserverTest {

    @Test
    void main() {
        // ConcreteSubject (관찰대상자)
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        // ConcreteObserver 등록
        weatherStation.registerObserver(temperatureDisplay);

        // 기온이 변경되면 온도 표시기에 자동으로 업데이트 된다.
        weatherStation.setTemperature(-10);
    }

}