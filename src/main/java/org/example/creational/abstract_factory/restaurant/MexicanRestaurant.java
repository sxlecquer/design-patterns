package org.example.creational.abstract_factory.restaurant;

import org.example.creational.abstract_factory.beef_burger.BeefBurger;
import org.example.creational.abstract_factory.beef_burger.BeefMexicanBurger;
import org.example.creational.abstract_factory.veggie_burger.VeggieBurger;
import org.example.creational.abstract_factory.veggie_burger.VeggieMexicanBurger;

public class MexicanRestaurant extends Restaurant {
    @Override
    protected BeefBurger createBeefBurger() {
        return new BeefMexicanBurger();
    }

    @Override
    protected VeggieBurger createVeggieBurger() {
        return new VeggieMexicanBurger();
    }
}
