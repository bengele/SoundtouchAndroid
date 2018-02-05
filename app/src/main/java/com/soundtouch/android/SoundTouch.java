package com.soundtouch.android;

import com.soundtouch.android.helper.SoundTouchHelper;

/**
 * Created by ben on 2018/1/26.
 */

public class SoundTouch {

    private static SoundTouch instance;
    long handle = 0;

    public static SoundTouch Instance() {
        if (instance == null) {
            instance = new SoundTouch();
        }
        return instance;
    }

    public SoundTouch() {
        handle = SoundTouchHelper.newInstance();
    }

    public static String getVersion() {
        return SoundTouchHelper.getVersionString();
    }

    public void close() {
        SoundTouchHelper.deleteInstance(handle);
        handle = 0;
    }

    public void setTempo(float tempo) {
        SoundTouchHelper.setTempo(handle, tempo);
    }

    public void setPitchSemiTones(float semiTones) {
        SoundTouchHelper.setPitchSemiTones(handle, semiTones);
    }

    public void setSpeed(float speed) {
        SoundTouchHelper.setSpeed(handle, speed);
    }

    public int processFile(String inputPath, String outputPath) {
        return SoundTouchHelper.processFile(handle, inputPath, outputPath);
    }

    public String getErrorString(){
        return SoundTouchHelper.getErrorString();
    }
}
