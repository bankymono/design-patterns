package pizza;

import pizza.ingredients.Dough;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Veggie Pizza";
        dough = null;
        sauce = null;

//        toppings.add("Shredded Mozzarella Veggie");
    }

    @Override
    void prepare() {
//
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
