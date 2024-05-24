package org.example.behavioral.template_method.loader;

import java.util.Random;

public abstract class BaseGameLoader {

    // template method
    public void load() {
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        cleanTempFiles();
        initProfile();
    }

    protected abstract byte[] loadLocalData();

    protected abstract void createObjects(byte[] data);

    protected abstract void downloadAdditionalFiles();

    protected abstract void initProfile();

    // common behavior
    protected void cleanTempFiles() {
        System.out.print("Cleaning temporary files... ");
        simulateNetworkLatency();
        System.out.println("Done!");
    }

    protected void simulateNetworkLatency() {
        try {
            int latency = new Random().nextInt(10);
            for(int i = 0; i < latency; i++) {
                Thread.sleep(50);
            }
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
