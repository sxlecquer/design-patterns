package org.example.creational.abstract_factory.veggie_burger;

public class VeggieMexicanBurger implements VeggieBurger {
    @Override
    public void prepare() {
        System.out.println("Veggie mexican burger is ready!");
    }
}
