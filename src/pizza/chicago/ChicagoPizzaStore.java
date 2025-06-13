package pizza.chicago;

import pizza.ChicagoStyleCheesePizza;
import pizza.ChicagoStyleVeggiePizza;
import pizza.Pizza;
import pizza.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if(item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
