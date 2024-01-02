package hello.example.designpattern.observer.forecast;

/**
 * Subject (관찰 대상자, 주제, 주체) 인터페이스
 */
public interface Subject {
    // 옵저버 등록
    void registerObserver(Observer observer);

    // 옵저버 삭제
    void removeObserver(Observer observer);

    // 옵저버들에게 상태 변경 알림
    void notifyObservers();
}
