package hello.example.designpattern.chainofresponsibility.yuki;

public class SpecialSupport extends Support {

    // 특정 번호만 해결 가능
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        // 특정 번호만 해결 O
        if (trouble.getNumber() == number) {
            return true;
        } else {
            return false;
        }
    }
}
