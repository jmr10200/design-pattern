package hello.example.designpattern.adapter.duck;

// Duck 시스템에 Turkey 를 이용하기위한 어댑터
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0; i < 3; i++) {
            turkey.fly();
        }
    }
}