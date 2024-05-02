package org.example.creational.factory_method.restaurant;

import org.example.creational.factory_method.burger.BeefBurger;
import org.example.creational.factory_method.burger.Burger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
