package hello.example.designpattern.mediator.yuki;

public interface Mediator {
    // Colleague 설정
    public abstract void createColleagues();

    // Colleague 의 상태가 변화했을 때 호출
    public abstract void colleagueChanged();
}
