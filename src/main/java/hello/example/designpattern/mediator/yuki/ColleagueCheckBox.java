package hello.example.designpattern.mediator.yuki;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckBox extends Checkbox implements ItemListener, Colleague {

    private Mediator mediator;

    public ColleagueCheckBox(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
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
    }

    @Override
    public void itemStateChanged(ItemEvent event) {
        // 상태가 변화하면 Mediator 에게 알린다
        mediator.colleagueChanged();
    }

}
