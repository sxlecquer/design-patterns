package org.example.structural.proxy;

import org.example.structural.proxy.video.ProxyVideoDownloader;
import org.example.structural.proxy.video.RealVideoDownloader;
import org.example.structural.proxy.video.VideoDownloader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing a regular video downloader...\n");
        long naive = test(new RealVideoDownloader());

        System.out.println("\nTesting a proxy video downloader...\n");
        long smart = test(new ProxyVideoDownloader());

        System.out.println("\nTime saved by caching proxy: " + (naive - smart));
    }

    private static long test(VideoDownloader videoDownloader) {
        System.out.println("-----------------------------------");
        long start = System.currentTimeMillis();
        System.out.println("Downloaded video: " + videoDownloader.download("abc-def-123") + "\n");
        System.out.println("Downloaded video: " + videoDownloader.download("ghi-jkl-456") + "\n");
        System.out.println("Downloaded video: " + videoDownloader.download("abc-def-123") + "\n");
        System.out.println("Downloaded video: " + videoDownloader.download("mno-pqr-789") + "\n");
        System.out.println("Downloaded video: " + videoDownloader.download("ghi-jkl-456") + "\n");
        long end = System.currentTimeMillis() - start;
        System.out.println("Time elapsed: " + end);
        System.out.println("-----------------------------------");
        return end;
    }
}
