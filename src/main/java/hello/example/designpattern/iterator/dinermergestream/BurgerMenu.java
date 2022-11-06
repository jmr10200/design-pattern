package hello.example.designpattern.iterator.dinermergestream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * 햄버거 메뉴 : ArrayList
 */
public class BurgerMenu implements Menu {
    List<MenuItem> menuItemList;

    public BurgerMenu() {
        menuItemList = new ArrayList<>();
        addItem("머쉬룸버거", "버섯, 콩이 재료인 패티로 만든 버거", true, 8000);
        addItem("치킨버거", "치킨 다리살로 만든 버거", false, 9000);
        addItem("한우버거", "1++ 한우로 만든 버거", false, 15000);
        addItem("새우버거", "새우가 듬뿍 들어간 버거", false, 10000);
        addItem("야채버거", "야채를 튀겨 만든 버거", true, 7000);
    }

    public void addItem(String name, String description, boolean vegetarian, long price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItemList.add(menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        // 자바가 제공해주는 Iterator
        return menuItemList.iterator();
    }

    @Override
    public String toString() {
        return "burgerMenu{" +
                "menuItemList=" + menuItemList +
                '}';
    }
}
