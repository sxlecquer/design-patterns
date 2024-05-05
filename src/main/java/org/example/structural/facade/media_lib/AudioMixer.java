package org.example.structural.facade.media_lib;

import java.io.File;

public class AudioMixer {
    public static File fix(VideoFile videoFile) {
        System.out.println("Audio in '" + videoFile.getName() + "' was fixed!");
        return new File("fixed." + videoFile.getCodecType().getCodecName());
    }
}
