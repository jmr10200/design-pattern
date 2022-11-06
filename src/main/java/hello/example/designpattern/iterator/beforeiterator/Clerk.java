package hello.example.designpattern.iterator.beforeiterator;

import java.util.List;

public class Clerk {

    SteakMenu steakMenu; // Array
    BurgerMenu burgerMenu; // List

    public Clerk(SteakMenu steakMenu, BurgerMenu burgerMenu) {
        this.steakMenu = steakMenu;
        this.burgerMenu = burgerMenu;
    }

    public void printMenu() {
        System.out.println("===== Steak Menu =====");
        printMenu(steakMenu.getMenuItemList());
        System.out.println("===== Burger Menu =====");
        printMenu(burgerMenu.getMenuItemList());
    }

    public void printMenu(MenuItem[] menus) {
        for (int i = 0; i < menus.length; i++) {
            MenuItem menu = menus[i];
            System.out.println("name = " + menu.getName() + ", price = " + menu.getPrice());
            System.out.println("description = " + menu.getDescription());
        }
    }

    public void printMenu(List<MenuItem> menus) {
        for (MenuItem m : menus) {
            System.out.println("name = " + m.getName() + ", price = " + m.getPrice());
            System.out.println("description = " + m.getDescription());
        }
    }

    public void printVegetarianMenu() {
        printVegetarianMenu(steakMenu.getMenuItemList());
        printVegetarianMenu(burgerMenu.getMenuItemList());
    }

    public void printVegetarianMenu(MenuItem[] menus) {
        for (int i = 0; i < menus.length; i++) {
            MenuItem menu = menus[i];
            if (menu.isVegetarian()) {
                System.out.println("name = " + menu.getName() + ", price = " + menu.getPrice());
                System.out.println("description = " + menu.getDescription());
            }
        }
    }

    public void printVegetarianMenu(List<MenuItem> menus) {
        for (MenuItem m : menus) {
            if (m.isVegetarian()) {
                System.out.println("name = " + m.getName() + ", price = " + m.getPrice());
                System.out.println("description = " + m.getDescription());
            }
        }
    }

    public boolean isItemVegetarian(String name) {
        MenuItem[] steakMenus = steakMenu.getMenuItemList();
        List<MenuItem> burgerMenus = burgerMenu.getMenuItemList();

        if (isVegetarian(name, steakMenus)) {
            return true;
        }
        if (isVegetarian(name, burgerMenus)) {
            return true;
        }
        return false;
    }

    private boolean isVegetarian(String name, MenuItem[] menus) {
        for (int i = 0; i < menus.length; i++) {
            MenuItem menuItem = menus[i];
            if (menuItem.getName().equals(name)) {
                if (menuItem.isVegetarian()) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isVegetarian(String name, List<MenuItem> menuItemLists) {
        for (MenuItem m : menuItemLists) {
            if (m.getName().equals(name)) {
                if (m.isVegetarian()) {
                    return true;
                }
            }
        }
        return false;
    }

}
