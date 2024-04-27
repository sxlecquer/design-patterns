package org.example.factory_method.restaurant;

import org.example.factory_method.burger.Burger;
import org.example.factory_method.burger.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
