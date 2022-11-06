package hello.example.designpattern.iterator.dinermergebasic;

import java.util.List;

public class BurgerMenuIterator implements Iterator {
    List<MenuItem> menuItemsList;
    int position = 0;

    public BurgerMenuIterator(List<MenuItem> menuItemsList) {
        this.menuItemsList = menuItemsList;
    }

    @Override
    public boolean hasNext() {
        return menuItemsList.size() > position;
    }

    @Override
    public MenuItem next() {
        return menuItemsList.get(position++);
    }
}
