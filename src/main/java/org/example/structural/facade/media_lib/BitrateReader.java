package org.example.structural.facade.media_lib;

import org.example.structural.facade.media_lib.codec.Codec;

public class BitrateReader {
    public static VideoFile read(VideoFile videoFile, Codec codec) {
        System.out.println("The file '" + videoFile.getName() + "' was read using " + codec.getName() + " format!");
        return videoFile;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        String fileName = buffer.getName();
        System.out.println("The file '" + fileName + "' was converted to " + codec.getName() + " format!");
        return new VideoFile(fileName.substring(0, fileName.lastIndexOf(".") + 1).concat(codec.getName()));
    }
}
