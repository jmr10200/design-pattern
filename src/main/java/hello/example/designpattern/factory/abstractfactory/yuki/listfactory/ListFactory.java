package hello.example.designpattern.factory.abstractfactory.yuki.listfactory;

import hello.example.designpattern.factory.abstractfactory.yuki.factory.Factory;
import hello.example.designpattern.factory.abstractfactory.yuki.factory.Link;
import hello.example.designpattern.factory.abstractfactory.yuki.factory.Page;
import hello.example.designpattern.factory.abstractfactory.yuki.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
