package hello.example.designpattern.iterator.dinermergebasic;

public class Clerk {

    Menu steakMenu;
    Menu burgerMenu;

    public Clerk(Menu steakMenu, Menu burgerMenu) {
        this.steakMenu = steakMenu;
        this.burgerMenu = burgerMenu;
    }

    public void printMenu() {
        Iterator steakIterator = steakMenu.createIterator();
        Iterator burgerIterator = burgerMenu.createIterator();

        System.out.println("===== Steak Menu =====");
        printMenu(steakIterator);
        System.out.println("===== Burger Menu =====");
        printMenu(burgerIterator);
    }

    public void printMenu(Iterator menuIter) {
        while (menuIter.hasNext()) {
            MenuItem menuItem = menuIter.next();
            System.out.println("name = " + menuItem.getName() + ", price = " + menuItem.getPrice());
            System.out.println("description = " + menuItem.getDescription());
        }
    }

    public void printVegetarianMenu() {
        printVegetarianMenu(steakMenu.createIterator());
        printVegetarianMenu(burgerMenu.createIterator());
    }

    public void printVegetarianMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem.isVegetarian()) {
                System.out.println("name = " + menuItem.getName() + ", price = " + menuItem.getPrice());
                System.out.println("description = " + menuItem.getDescription());
            }
        }
    }

    public boolean isItemVegetarian(String name) {
        Iterator steakIter = steakMenu.createIterator();
        Iterator burgerIter = burgerMenu.createIterator();

        if (isVegetarian(name, steakIter)) {
            return true;
        }
        if (isVegetarian(name, burgerIter)) {
            return true;
        }
        return false;
    }

    private boolean isVegetarian(String name, Iterator iter) {
        while (iter.hasNext()) {
            MenuItem menuItem = iter.next();
            if (menuItem.getName().equals(name)) {
                if (menuItem.isVegetarian()) {
                    return true;
                }
            }
        }
        return false;
    }
}
