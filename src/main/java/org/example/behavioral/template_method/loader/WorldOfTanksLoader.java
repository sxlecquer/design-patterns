package org.example.behavioral.template_method.loader;

public class WorldOfTanksLoader extends BaseGameLoader {
    @Override
    protected byte[] loadLocalData() {
        System.out.print("Loading local World of Tanks files... ");
        simulateNetworkLatency();
        System.out.println("Done!");
        return new byte[1024];
    }

    @Override
    protected void createObjects(byte[] data) {
        System.out.print("Creating World of Tanks objects... ");
        simulateNetworkLatency();
        System.out.println("Created!");
    }

    @Override
    protected void downloadAdditionalFiles() {
        System.out.print("Downloading additional World of Tanks files... ");
        simulateNetworkLatency();
        System.out.println("Done!");
    }

    @Override
    protected void initProfile() {
        System.out.print("Initializing World of Tanks profile... ");
        simulateNetworkLatency();
        System.out.println("Done!");
    }
}
