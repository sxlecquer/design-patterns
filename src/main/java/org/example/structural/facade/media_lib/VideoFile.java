package org.example.structural.facade.media_lib;

import org.example.structural.facade.media_lib.codec.CodecType;

import java.util.Arrays;

public class VideoFile {
    private final String name;
    private final CodecType codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = extractCodecType(name);
    }

    public String getName() {
        return name;
    }

    public CodecType getCodecType() {
        return codecType;
    }

    private static CodecType extractCodecType(String name) {
        return Arrays.stream(CodecType.values())
                .filter(type -> type.getCodecName().equals(name.substring(name.lastIndexOf(".") + 1)))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No matching codec type found for file " + name));
    }
}
