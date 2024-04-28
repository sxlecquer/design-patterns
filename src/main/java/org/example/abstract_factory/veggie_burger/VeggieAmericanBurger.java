package org.example.abstract_factory.veggie_burger;

public class VeggieAmericanBurger implements VeggieBurger {
    @Override
    public void prepare() {
        System.out.println("Veggie american burger is ready!");
    }
}
