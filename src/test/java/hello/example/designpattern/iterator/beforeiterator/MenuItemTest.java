package hello.example.designpattern.iterator.beforeiterator;

import org.junit.jupiter.api.Test;

class MenuItemTest {

    @Test
    void beforeIterator() {
        SteakMenu steakMenu = new SteakMenu();
        BurgerMenu burgerMenu = new BurgerMenu();
        Clerk clerk = new Clerk(steakMenu, burgerMenu);

        // 호출
        System.out.println("***** Print Menu *****");
        System.out.println();
        clerk.printMenu();
        System.out.println();
        System.out.println("***** Print Vegetarian Menu *****");
        clerk.printVegetarianMenu();
    }

}