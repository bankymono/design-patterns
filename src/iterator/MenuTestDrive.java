package iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafe = new Menu("CAFE MENU", "Dinner");
        MenuComponent desertMenu = new Menu("DESSERT MENU", "Dessert of course");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafe);

        dinerMenu.add(new MenuItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89));

        dinerMenu.add(desertMenu);

        dinerMenu.add(new MenuItem("Apple Pie",
                "Apple pie with a flatkey crust, topped with vanilla ice cream",
                true,
                1.59));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
//        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//        DinerMenu dinerMenu = new DinerMenu();
//        CafeMenu cafeMenu = new CafeMenu();

//        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

//        waitress.printMenu();
    }
}
