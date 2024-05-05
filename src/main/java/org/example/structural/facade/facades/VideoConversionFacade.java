package org.example.structural.facade.facades;

import org.example.structural.facade.media_lib.AudioMixer;
import org.example.structural.facade.media_lib.BitrateReader;
import org.example.structural.facade.media_lib.VideoFile;
import org.example.structural.facade.media_lib.codec.Codec;
import org.example.structural.facade.media_lib.codec.CodecFactory;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("Video conversion started!");
        VideoFile videoFile = new VideoFile(fileName);
        Codec source = CodecFactory.extract(videoFile);
        Codec dest = CodecFactory.extract(new VideoFile("." + format));

        VideoFile buffer = BitrateReader.read(videoFile, source);
        VideoFile corrupted = BitrateReader.convert(buffer, dest);
        File result = AudioMixer.fix(corrupted);
        System.out.println("Video conversion completed!");
        return result;
    }
}
