package hello.example.designpattern.decorator.yuki;

public abstract class Border extends Display {

    // 장식이 감싸는 대상 '내용물'
    protected Display display;

    // 인스턴스 생성시 '내용물'을 인수로 지정
    public Border(Display display) {
        this.display = display;
    }
}
