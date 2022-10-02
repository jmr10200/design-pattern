package hello.example.designpattern.templatemethod;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("티를 우려낸다.");
    }

    @Override
    public void addCondiments() {
        System.out.println("레몬을 첨가한다.");
    }

    // hook
    @Override
    void addExtra() {
        System.out.println("티 엑스트라 처리");
    }
}
