package hello.example.designpattern.iterator.dinermergebasic;

public class SteakMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public SteakMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.length > position;
    }

    @Override
    public MenuItem next() {
        return menuItems[position++];
    }
}
