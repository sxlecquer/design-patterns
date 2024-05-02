package org.example.creational.abstract_factory.restaurant;

import org.example.creational.abstract_factory.veggie_burger.VeggieBurger;
import org.example.creational.abstract_factory.beef_burger.BeefBurger;

public abstract class Restaurant {
    public BeefBurger orderBeefBurger() {
        BeefBurger beefBurger = createBeefBurger();
        beefBurger.prepare();
        return beefBurger;
    }

    public VeggieBurger orderVeggieBurger() {
        VeggieBurger veggieBurger = createVeggieBurger();
        veggieBurger.prepare();
        return veggieBurger;
    }

    protected abstract BeefBurger createBeefBurger(); // factory method

    protected abstract VeggieBurger createVeggieBurger(); // factory method
}
