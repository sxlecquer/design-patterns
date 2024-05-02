package org.example.creational.factory_method;

import org.example.creational.factory_method.burger.Burger;
import org.example.creational.factory_method.restaurant.BeefBurgerRestaurant;
import org.example.creational.factory_method.restaurant.Restaurant;
import org.example.creational.factory_method.restaurant.VeggieBurgerRestaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant beefBurgerRestaurant = new BeefBurgerRestaurant();
        Burger beefBurger = beefBurgerRestaurant.orderBurger();
        System.out.println(beefBurger.getClass().getSimpleName() + " can be eaten!");

        System.out.println();

        Restaurant veggieBurgerRestaurant = new VeggieBurgerRestaurant();
        Burger veggieBurger = veggieBurgerRestaurant.orderBurger();
        System.out.println(veggieBurger.getClass().getSimpleName() + " can be eaten!");
    }
}
