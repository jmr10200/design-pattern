package hello.example.designpattern.observer.basic;

public class ConcreteObserver implements Observer {
    private int value;
    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
//        display();
    }

    public void display() {
        System.out.println("Value = " + value);
    }

    // 테스트용 getter
    public int getValue() {
        return value;
    }
}
