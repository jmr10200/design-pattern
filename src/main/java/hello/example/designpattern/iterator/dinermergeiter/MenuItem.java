package hello.example.designpattern.iterator.dinermergeiter;

/**
 * 두 가게의 합의한 메뉴
 */
public class MenuItem {

    String name; // 메뉴명
    String description; // 설명
    boolean vegetarian; // 베지테리언 여부
    Long price; // 가격

    public MenuItem(String name, String description, Boolean vegetarian, Long price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public Long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }
}
