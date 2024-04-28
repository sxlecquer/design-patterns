package org.example.abstract_factory;

import org.example.abstract_factory.beef_burger.BeefBurger;
import org.example.abstract_factory.restaurant.AmericanRestaurant;
import org.example.abstract_factory.restaurant.MexicanRestaurant;
import org.example.abstract_factory.restaurant.Restaurant;
import org.example.abstract_factory.veggie_burger.VeggieBurger;

public class Main {
    public static void main(String[] args) {
        Restaurant americanRestaurant = new AmericanRestaurant();
        BeefBurger americanBeefBurger = americanRestaurant.orderBeefBurger();
        System.out.println(americanBeefBurger.getClass().getSimpleName() + " can be eaten!\n");
        VeggieBurger americanVeggieBurger = americanRestaurant.orderVeggieBurger();
        System.out.println(americanVeggieBurger.getClass().getSimpleName() + " can be eaten!");

        System.out.println();

        Restaurant mexicanRestaurant = new MexicanRestaurant();
        BeefBurger mexicanBeefBurger = mexicanRestaurant.orderBeefBurger();
        System.out.println(mexicanBeefBurger.getClass().getSimpleName() + " can be eaten!\n");
        VeggieBurger mexicanVeggieBurger = mexicanRestaurant.orderVeggieBurger();
        System.out.println(mexicanVeggieBurger.getClass().getSimpleName() + " can be eaten!");
    }
}
