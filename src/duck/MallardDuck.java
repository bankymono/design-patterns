package duck;

import duck.behaviors.impl.FlyWithWings;
import duck.behaviors.impl.HopWithHappyFeet;
import duck.behaviors.impl.Quack;

public class MallardDuck extends Duck{
    public MallardDuck () {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }


    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
