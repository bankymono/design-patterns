package duck;

import duck.behaviors.impl.FlyNoWay;
import duck.behaviors.impl.MuteQuack;
import duck.behaviors.impl.Quack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
