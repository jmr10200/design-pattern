package hello.example.designpattern.iterator.beforeiterator;

/**
 * 스테이크 메뉴 : Array
 */
public class SteakMenu {

    public static final int MAX_ITEMS = 5; // 최대 메뉴 갯수 5개
    int numberOfItems = 0;
    MenuItem[] menuItemList;

    public SteakMenu() {
        menuItemList = new MenuItem[MAX_ITEMS];
        addMenu("안심 스테이크", "안심스테이크, 구운버섯, 구운양파", false, 18000);
        addMenu("T본 스테이크", "T본 스테이크, 구운파인애플, 구운버섯", false, 20000);
        addMenu("등심 스테이크", "등심스테이크, 구운마늘, 구운감자", false, 15000);
        addMenu("채끝 스테이크", "채끝스테이크, 구운마늘, 구운아스파라거스", false, 12000);
        addMenu("콩고기 스테이크", "콩고기스테이크, 구운아스파라거스, 구운양파, 구운파인애플", true, 17000);
    }

    public void addMenu(String name, String description, boolean vegietarian, long price) {
        MenuItem menuItem = new MenuItem(name, description, vegietarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("등록할 수 있는 메뉴 갯수를 초과했습니다.");
        } else {
            menuItemList[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public MenuItem[] getMenuItemList() {
        return menuItemList;
    }

}
