package hello.example.designpattern.state.appliances;

/**
 * Context (문맥, 상황)
 */
public class TvContext implements State {
    private State tvState;

    public TvContext() {
        // 초기 상태 : TV 가 꺼져있는 상태
        tvState = new TvOffState();
    }

    public void setTvState(State tvState) {
        this.tvState = tvState;
    }

    @Override
    public void turnOn() {
        tvState.turnOn();
        // 상태전환
        setTvState(new TvOnState());
    }

    @Override
    public void turnOff() {
        tvState.turnOff();
        // 상태전환
        setTvState(new TvOffState());
    }
}
