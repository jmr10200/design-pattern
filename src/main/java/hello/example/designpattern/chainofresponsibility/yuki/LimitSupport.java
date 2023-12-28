package hello.example.designpattern.chainofresponsibility.yuki;

public class LimitSupport extends Support {

    // 이 번호 미만이면 해결 가능
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
}
