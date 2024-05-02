package org.example.creational.abstract_factory.beef_burger;

public class BeefMexicanBurger implements BeefBurger {
    @Override
    public void prepare() {
        System.out.println("Beef mexican burger is ready!");
    }
}
