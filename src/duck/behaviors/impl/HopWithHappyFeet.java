package duck.behaviors.impl;

import duck.behaviors.HopBehavior;

public class HopWithHappyFeet implements HopBehavior {
    @Override
    public void hop() {
        System.out.println("I am hopping!");
    }
}
