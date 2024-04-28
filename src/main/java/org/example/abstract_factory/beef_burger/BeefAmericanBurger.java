package org.example.abstract_factory.beef_burger;

public class BeefAmericanBurger implements BeefBurger {
    @Override
    public void prepare() {
        System.out.println("Beef american burger is ready!");
    }
}
