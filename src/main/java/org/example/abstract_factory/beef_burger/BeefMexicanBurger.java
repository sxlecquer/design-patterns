package org.example.abstract_factory.beef_burger;

public class BeefMexicanBurger implements BeefBurger {
    @Override
    public void prepare() {
        System.out.println("Beef mexican burger is ready!");
    }
}
