package hello.example.designpattern.adapter.yuki.delegation;

import hello.example.designpattern.adapter.yuki.Banner;

public class PrintBannerByDelegation extends PrintByDelegation {

    private Banner banner;

    public PrintBannerByDelegation(String copy) {
        this.banner = new Banner(copy);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
