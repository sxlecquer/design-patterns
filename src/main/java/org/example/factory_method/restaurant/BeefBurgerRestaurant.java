package org.example.factory_method.restaurant;

import org.example.factory_method.burger.BeefBurger;
import org.example.factory_method.burger.Burger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
