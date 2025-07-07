package iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {
//    Menu pancakeHouseMenu;
//    Menu dinerMenu;
//    Menu cafeMenu;

    List<Menu> menus;

//    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, CafeMenu cafeMenu) {
//        this.pancakeHouseMenu = pancakeHouseMenu;
//        this.dinerMenu = dinerMenu;
//        this.cafeMenu = cafeMenu;
//    }

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

//    public void printMenu(){
//        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
//        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
//        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
//
//        System.out.println("MENU\n----\nBREAKFAST");
//        printMenu(pancakeIterator);
//        System.out.println("\nLUNCH");
//        printMenu(dinerIterator);
//        System.out.println("\nDINNER");
//        printMenu(cafeIterator);
//    }


    public void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
