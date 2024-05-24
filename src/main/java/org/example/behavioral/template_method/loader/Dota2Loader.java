package org.example.behavioral.template_method.loader;

public class Dota2Loader extends BaseGameLoader {
    @Override
    protected byte[] loadLocalData() {
        System.out.print("Loading local Dota 2 files... ");
        simulateNetworkLatency();
        System.out.println("Done!");
        return new byte[1024];
    }

    @Override
    protected void createObjects(byte[] data) {
        System.out.print("Creating Dota 2 objects... ");
        simulateNetworkLatency();
        System.out.println("Created!");
    }

    @Override
    protected void downloadAdditionalFiles() {
        System.out.print("Downloading additional Dota 2 files... ");
        simulateNetworkLatency();
        System.out.println("Done!");
    }

    @Override
    protected void initProfile() {
        System.out.print("Initializing Dota 2 profile... ");
        simulateNetworkLatency();
        System.out.println("Done!");
    }
}
