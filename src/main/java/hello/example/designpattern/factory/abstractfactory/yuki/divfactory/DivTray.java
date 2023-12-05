package hello.example.designpattern.factory.abstractfactory.yuki.divfactory;

import hello.example.designpattern.factory.abstractfactory.yuki.factory.Item;
import hello.example.designpattern.factory.abstractfactory.yuki.factory.Tray;

public class DivTray extends Tray {

    public DivTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();

        sb.append("<p><b>");
        sb.append(caption);
        sb.append("</b></p>\n");
        sb.append("<div class=\"TRAY\">");
        for (Item item : tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</div>\n");
        return sb.toString();
    }
}
