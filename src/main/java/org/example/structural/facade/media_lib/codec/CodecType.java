package org.example.structural.facade.media_lib.codec;

public enum CodecType {
    MP4("mp4"),
    VP9("vp9");

    private final String codecName;

    CodecType(String codecName) {
        this.codecName = codecName;
    }

    public String getCodecName() {
        return codecName;
    }
}
