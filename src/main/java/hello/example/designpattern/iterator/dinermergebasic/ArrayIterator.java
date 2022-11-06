package hello.example.designpattern.iterator.dinermergebasic;

public class ArrayIterator implements Iterator {

    MenuItem[] menuItems;
    int position;

    public ArrayIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }
}
