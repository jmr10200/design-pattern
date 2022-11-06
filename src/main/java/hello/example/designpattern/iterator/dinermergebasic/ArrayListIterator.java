package hello.example.designpattern.iterator.dinermergebasic;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {

    ArrayList<MenuItem> menuItemList;
    int position;

    public ArrayListIterator(ArrayList<MenuItem> menuItems) {
        this.menuItemList = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItemList.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItemList.get(position);
        position += 1;
        return menuItem;
    }
}
