package hello.example.designpattern.mediator.yuki;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    // Mediator 설정
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator 에서 활성/비활성 지시
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        // 활성/비활성에 맞게 배경색 변경
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent event) {
        // 문자열이 바뀌면 Mediator 에 알린다
        mediator.colleagueChanged();
    }
}
