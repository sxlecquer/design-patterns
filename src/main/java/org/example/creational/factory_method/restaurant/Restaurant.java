package org.example.creational.factory_method.restaurant;

import org.example.creational.factory_method.burger.Burger;

public abstract class Restaurant {
    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    protected abstract Burger createBurger(); // factory method
}
