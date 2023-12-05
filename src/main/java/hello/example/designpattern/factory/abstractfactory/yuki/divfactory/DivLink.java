package hello.example.designpattern.factory.abstractfactory.yuki.divfactory;

import hello.example.designpattern.factory.abstractfactory.yuki.factory.Link;

public class DivLink extends Link {

    public DivLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<div class=\"LINK\"><a href=\"" + url + "\">" + caption + "</a></div>\n";
    }
}
