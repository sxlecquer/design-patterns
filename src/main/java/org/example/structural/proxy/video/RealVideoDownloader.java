package org.example.structural.proxy.video;

import java.util.Random;

public class RealVideoDownloader implements VideoDownloader {
    @Override
    public Video download(String videoId) {
        System.out.print("Connecting to https://youtube.com/" + videoId + "... ");
        simulateNetworkLatency(1, 3);
        System.out.println("Connected!");
        System.out.print("Downloading a video... ");
        simulateNetworkLatency(7, 12);
        System.out.println("Done!");
        return new Video(videoId, "Video title", "Video data");
    }

    private void simulateNetworkLatency(int from, int to) {
        try {
            int latency = new Random().nextInt(from, to);
            for(int i = 0; i < latency; i++) {
                Thread.sleep(50);
            }
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
