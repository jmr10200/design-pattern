package hello.example.designpattern.iterator.dinermergeiter;

import java.util.Iterator;

public class Clerk {

    Menu steakMenu;
    Menu burgerMenu;

    public Clerk(Menu steakMenu, Menu burgerMenu) {
        this.steakMenu = steakMenu;
        this.burgerMenu = burgerMenu;
    }

    /**
     * 이터레이터 사용
     */
    public void printMenu() {
        Iterator<MenuItem> steakMenuIterator = steakMenu.createIterator();
        Iterator<MenuItem> burgerMenuIterator = burgerMenu.createIterator();

        System.out.println("===== Steak Menu =====");
        printMenu(steakMenuIterator);
        System.out.println("===== Burger Menu =====");
        printMenu(burgerMenuIterator);
    }

    public void printMenu(Iterator<MenuItem> menuItemIterator) {
        while (menuItemIterator.hasNext()) {
            MenuItem menuItem = menuItemIterator.next();
            System.out.println("name = " + menuItem.getName() + ", price = " + menuItem.getPrice());
            System.out.println("description = " + menuItem.getDescription());
        }
    }

    public void printVegetarianMenu() {
        printVegetarianMenu(steakMenu.createIterator());
        printVegetarianMenu(burgerMenu.createIterator());
    }

    public void printVegetarianMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem.isVegetarian()) {
                System.out.println("name = " + menuItem.getName() + ", price = " + menuItem.getPrice());
                System.out.println("description = " + menuItem.getDescription());
            }
        }
    }

    public boolean isItemVegetarian(String name) {
        Iterator steakMenuIterator = steakMenu.createIterator();
        Iterator burgerMenuIterator = burgerMenu.createIterator();

        if (isVegetarian(name, steakMenuIterator)) {
            return true;
        }
        if (isVegetarian(name, burgerMenuIterator)) {
            return true;
        }
        return false;
    }

    private boolean isVegetarian(String name, Iterator<MenuItem> menuItemIterator) {
        while (menuItemIterator.hasNext()) {
            MenuItem menuItem = menuItemIterator.next();
            if (menuItem.getName().equals(name)) {
                if (menuItem.isVegetarian()) {
                    return true;
                }
            }
        }
        return false;
    }

}
