package hello.example.designpattern.mediator.yuki;

public interface Colleague {
    // Mediator 설정
    public abstract void setMediator(Mediator mediator);

    // Mediator 에서 활성/비활성을 지시
    public abstract void setColleagueEnabled(boolean enabled);
}
