package pizza.california;

import pizza.*;
import pizza.ingredients.california.CaliforniaPizzaIngredientFactory;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();
        if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("California Style Cheese Pizza");
        } else if(item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("California Style Pepperoni Pizza");
        }

//        if (item.equals("cheese")) {
//            return new CaliforniaStyleCheesePizza();
//        } else if(item.equals("veggie")) {
//            return new CaliforniaStyleVeggiePizza();
//        } else {
//            return null;
//        }
        return pizza;
    }
}
