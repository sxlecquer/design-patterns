package org.example.factory_method.restaurant;

import org.example.factory_method.burger.Burger;

public abstract class Restaurant {
    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    protected abstract Burger createBurger(); // factory method
}
