package org.example.abstract_factory.restaurant;

import org.example.abstract_factory.beef_burger.BeefAmericanBurger;
import org.example.abstract_factory.beef_burger.BeefBurger;
import org.example.abstract_factory.veggie_burger.VeggieAmericanBurger;
import org.example.abstract_factory.veggie_burger.VeggieBurger;

public class AmericanRestaurant extends Restaurant {
    @Override
    protected BeefBurger createBeefBurger() {
        return new BeefAmericanBurger();
    }

    @Override
    protected VeggieBurger createVeggieBurger() {
        return new VeggieAmericanBurger();
    }
}
