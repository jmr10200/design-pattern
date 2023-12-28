package hello.example.designpattern.chainofresponsibility.yuki;

public class Trouble {

    // 트러블 번호
    private int number;

    // 트러블 생성
    public Trouble(int number) {
        this.number = number;
    }

    // getter
    public int getNumber() {
        return number;
    }

    // toString
    @Override
    public String toString() {
        return "[ Trouble " + number + " ]";
    }
}
