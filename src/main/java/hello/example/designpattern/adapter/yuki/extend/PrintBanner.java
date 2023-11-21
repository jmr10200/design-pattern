package hello.example.designpattern.adapter.yuki.extend;

import hello.example.designpattern.adapter.yuki.Banner;

public class PrintBanner extends Banner implements Print{

    public PrintBanner(String copy) {
        super(copy);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
