package org.example.behavioral.template_method;

import org.example.behavioral.template_method.loader.Dota2Loader;
import org.example.behavioral.template_method.loader.WorldOfTanksLoader;

public class Main {
    public static void main(String[] args) {
        WorldOfTanksLoader wotLoader = new WorldOfTanksLoader();
        wotLoader.load();

        System.out.println("\n---------------------------------\n");

        Dota2Loader dotaLoader = new Dota2Loader();
        dotaLoader.load();
    }
}
