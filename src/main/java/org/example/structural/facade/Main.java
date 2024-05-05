package org.example.structural.facade;

import org.example.structural.facade.facades.VideoConversionFacade;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade facade = new VideoConversionFacade();
        File ignored = facade.convertVideo("howtocode.vp9", "mp4");

        // ... logic with the converted file
    }
}
