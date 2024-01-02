package hello.example.designpattern.state.yuki;

public interface Context {
    // 시간설정
    void setClock(int hour);

    // 상태전환
    void changeState(State state);

    // 경비센터 경비원 호출
    void callSecurityCenter(String msg);

    // 경비센터 기록
    void recordLog(String msg);

}
