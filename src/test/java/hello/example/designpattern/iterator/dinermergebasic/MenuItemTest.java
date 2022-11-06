package hello.example.designpattern.iterator.dinermergebasic;

import org.junit.jupiter.api.Test;

class MenuItemTest {

    @Test
    void basic() {
        Menu steakMenu = new SteakMenu();
        Menu burgerMenu = new BurgerMenu();

        Clerk clerk = new Clerk(steakMenu, burgerMenu);

        System.out.println("***** Menu Print *****");
        clerk.printMenu();

        System.out.println();
        System.out.println("***** vegetarian Menu Print *****");
        clerk.printVegetarianMenu();
    }

}