package hello.example.designpattern.builder.yuki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    @Test
    void textMain() {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getTextResult();
        System.out.println(result);
    }

    @Test
    void htmlMain() {
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director = new Director(htmlBuilder);
        director.construct();
        String result = htmlBuilder.getHTMLResult();
        System.out.println("HTML 파일 " + result + " 이 작성되었습니다.");
    }

}