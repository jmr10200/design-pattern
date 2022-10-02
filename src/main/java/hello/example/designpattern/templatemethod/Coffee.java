package hello.example.designpattern.templatemethod;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("커피를 추출한다.");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕, 우유를 첨가한다.");
    }

    // hook
    @Override
    void addExtra() {
        System.out.println("커피 엑스트라 처리");
    }
}
