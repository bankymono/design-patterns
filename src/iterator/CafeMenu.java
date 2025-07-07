package iterator;

import java.util.HashMap;
import java.util.Map;

public class CafeMenu {
    Map<String, MenuItem> menuitems = new HashMap<>();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie Burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, gucamole",
                true,
                4.29);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);

        menuitems.put(name, menuItem);
    }

    public Map<String, MenuItem> getMenuitems() {
        return menuitems;
    }
}
