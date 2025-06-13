package pizza.california;

import pizza.CaliforniaStyleCheesePizza;
import pizza.CaliforniaStyleVeggiePizza;
import pizza.Pizza;
import pizza.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if(item.equals("veggie")) {
            return new CaliforniaStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
