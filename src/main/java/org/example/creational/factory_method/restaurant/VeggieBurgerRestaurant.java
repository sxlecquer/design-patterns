package org.example.creational.factory_method.restaurant;

import org.example.creational.factory_method.burger.Burger;
import org.example.creational.factory_method.burger.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
