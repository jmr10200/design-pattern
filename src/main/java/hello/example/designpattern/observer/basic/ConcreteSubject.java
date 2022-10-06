package hello.example.designpattern.observer.basic;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observerList;
    private int value = 0;

    public ConcreteSubject() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observerList) {
            o.update(value);
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }
}
