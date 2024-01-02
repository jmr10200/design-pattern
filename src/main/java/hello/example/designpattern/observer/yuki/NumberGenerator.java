package hello.example.designpattern.observer.yuki;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    // Observer 저장
    private List<Observer> observerList = new ArrayList<>();

    // Observer 추가
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    // Observer 제거
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    // Observer 에 통지
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update(this);
        }
    }

    // number 취득
    public abstract int getNumber();

    // number 생성
    public abstract void execute();
}
