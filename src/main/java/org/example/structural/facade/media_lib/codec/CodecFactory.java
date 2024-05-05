package org.example.structural.facade.media_lib.codec;

import org.example.structural.facade.media_lib.VideoFile;

public class CodecFactory {
    public static Codec extract(VideoFile videoFile) {
        CodecType codecType = videoFile.getCodecType();
        if(codecType.getCodecName().equalsIgnoreCase("mp4")) {
            System.out.println("MPEG4 codec extracted!");
            return new MPEG4CompressionCodec();
        }
        System.out.println("VP9 codec extracted!");
        return new VP9CompressionCodec();
    }
}
