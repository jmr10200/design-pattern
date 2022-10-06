package hello.example.designpattern.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observerList; // 옵저버들
    private float temperature; // 온도
    private float humidity; // 습도
    private float pressure; // 기압

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    // 옵저버 등록
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    // 옵저버 삭제
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    // 업데이트 될 때
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    // 기상 관측값이 갱신될 때마다 알려주기위한 메소드
    public void measurementsChanged() {
        notifyObservers();
    }

    // 새로운 기상 관측값 갱신 메소드
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
