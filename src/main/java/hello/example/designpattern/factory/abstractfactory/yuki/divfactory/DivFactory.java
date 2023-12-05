package hello.example.designpattern.factory.abstractfactory.yuki.divfactory;

import hello.example.designpattern.factory.abstractfactory.yuki.factory.Factory;
import hello.example.designpattern.factory.abstractfactory.yuki.factory.Link;
import hello.example.designpattern.factory.abstractfactory.yuki.factory.Page;
import hello.example.designpattern.factory.abstractfactory.yuki.factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}
