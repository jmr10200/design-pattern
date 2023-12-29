package hello.example.designpattern.facade.yuki;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    // 타이틀 출력
    public void title(String title) throws IOException {
        writer.write("<!DOCTYPE html>");
        writer.write("\n");
        writer.write("<html>");
        writer.write("\n");
        writer.write("<head>");
        writer.write("\n");
        writer.write("<title>" + title + "</title>");
        writer.write("\n");
        writer.write("</head>");
        writer.write("\n");
        writer.write("<body>");
        writer.write("\n");
        writer.write("<h1>" + title + "</h1>");
        writer.write("\n");
    }

    // 단락 출력
    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>");
        writer.write("\n");
    }

    // 링크 출력
    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    // 이메일 주소 출력
    public void mailTo(String mailAddr, String username) throws IOException {
        link("mail To:" + mailAddr, username);
    }

    // HTML 닫기
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("\n");
        writer.write("</html>");
        writer.write("\n");
        writer.close();
    }
}
