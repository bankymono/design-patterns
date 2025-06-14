package pizza.chicago;

import pizza.*;
import pizza.ingredients.chicago.ChicagoPizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago style cheese Pizza");
        } else if(item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicage Style Veggie Pizza");
        } else if(item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }

//        if (item.equals("cheese")) {
//            return new ChicagoStyleCheesePizza();
//        } else if(item.equals("veggie")) {
//            return new ChicagoStyleVeggiePizza();
//        } else {
//            return null;
//        }

        return pizza;
    }
}
