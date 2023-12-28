package hello.example.designpattern.chainofresponsibility.yuki;

public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        //  자신은 아무것도 해결하지 않음
        return false;
    }
}
