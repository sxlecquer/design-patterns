package org.example.structural.proxy.video;

import java.util.HashMap;
import java.util.Map;

// caching and virtual (with lazy initialization) proxy
public class ProxyVideoDownloader implements VideoDownloader {
    private final Map<String, Video> videoCache = new HashMap<>();
    private static VideoDownloader videoDownloader;

    @Override
    public Video download(String videoId) {
        if(!videoCache.containsKey(videoId)) {
            if(videoDownloader == null) {
                videoDownloader = new RealVideoDownloader();
            }
            videoCache.put(videoId, videoDownloader.download(videoId));
        } else {
            System.out.println("Video '" + videoId + "' was retrieved from cache!");
        }
        return videoCache.get(videoId);
    }
}
