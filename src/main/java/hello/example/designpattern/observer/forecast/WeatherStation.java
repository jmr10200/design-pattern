package hello.example.designpattern.observer.forecast;


import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteSubject 구체적인 관찰 대상자, 주제, 주체
 */
public class WeatherStation implements Subject {
    private List<Observer> observers;
    private int temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }

    /**
     * ConcreteSubject 의 역할
     * Subject 의 상태가 변경될 때 (기온 변화가 있을 때) 옵저버들에게 알린다.
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
