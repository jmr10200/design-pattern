package hello.example.designpattern.factory.abstractfactory.yuki.listfactory;

import hello.example.designpattern.factory.abstractfactory.yuki.factory.Link;

public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "    <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }

}
