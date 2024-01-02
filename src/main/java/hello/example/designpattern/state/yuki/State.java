package hello.example.designpattern.state.yuki;

public interface State {
    // 시간 설정
    void doClock(Context context, int hour);

    // 금고 사용
    void doUse(Context context);

    // 비상벨
    void doAlarm(Context context);

    // 일반 통화
    void doPhone(Context context);
}
