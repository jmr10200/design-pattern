package hello.example.designpattern.factory.abstractfactory.yuki.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    void main() {
        // main() 메소드를 테스트 파일로 갈음한다.
        String filename = "abstract_factory.html";
        String classname = "hello.example.designpattern.factory.abstractfactory.yuki.listfactory.ListFactory";

        Factory factory = Factory.getFactory(classname);

        // Blog
        Link adapter = factory.createLink("Adapter", "https://gymdev.tistory.com/24");
        Link iterator = factory.createLink("Iterator", "https://gymdev.tistory.com/33");
        Link singleton = factory.createLink("Singleton", "https://gymdev.tistory.com/17");

        Tray blogTray = factory.createTray("Design Pattern Blog");
        blogTray.add(adapter);
        blogTray.add(iterator);
        blogTray.add(singleton);

        // Posts
        Link post1 = factory.createLink("Post 1", "https://gymdev.tistory.com/72");
        Link post2 = factory.createLink("Post 2", "https://gymdev.tistory.com/75");
        Tray post3 = factory.createTray("Post 3");
        post3.add(factory.createLink("Post 3 (US)", "https://gymdev.tistory.com/14"));
        post3.add(factory.createLink("Post 3 (KOR)", "https://gymdev.tistory.com/62"));

        Tray newsTray = factory.createTray("Post List");
        newsTray.add(post1);
        newsTray.add(post2);
        newsTray.add(post3);

        // Page
        Page page = factory.createPage("Blog and Posts", "gymdev.tistory.com");
        page.add(blogTray);
        page.add(newsTray);

        page.output(filename);
    }

    @Test
    void divMain() {
        // main() 메소드를 테스트 파일로 갈음한다.
        String filename = "div_abstract_factory.html";
        String classname = "hello.example.designpattern.factory.abstractfactory.yuki.divfactory.DivFactory";

        Factory factory = Factory.getFactory(classname);

        // Blog
        Link adapter = factory.createLink("Adapter", "https://gymdev.tistory.com/24");
        Link iterator = factory.createLink("Iterator", "https://gymdev.tistory.com/33");
        Link singleton = factory.createLink("Singleton", "https://gymdev.tistory.com/17");

        Tray blogTray = factory.createTray("Design Pattern Blog");
        blogTray.add(adapter);
        blogTray.add(iterator);
        blogTray.add(singleton);

        // Posts
        Link post1 = factory.createLink("Post 1", "https://gymdev.tistory.com/72");
        Link post2 = factory.createLink("Post 2", "https://gymdev.tistory.com/75");
        Tray post3 = factory.createTray("Post 3");
        post3.add(factory.createLink("Post 3 (US)", "https://gymdev.tistory.com/14"));
        post3.add(factory.createLink("Post 3 (KOR)", "https://gymdev.tistory.com/62"));

        Tray newsTray = factory.createTray("Post List");
        newsTray.add(post1);
        newsTray.add(post2);
        newsTray.add(post3);

        // Page
        Page page = factory.createPage("Blog and Posts", "gymdev.tistory.com");
        page.add(blogTray);
        page.add(newsTray);

        page.output(filename);
    }


}