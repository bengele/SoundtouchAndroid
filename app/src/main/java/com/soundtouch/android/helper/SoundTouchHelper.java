////////////////////////////////////////////////////////////////////////////////
///
/// Example class that invokes native SoundTouch routines through the JNI
/// interface.
///
/// Author        : Copyright (c) Olli Parviainen
/// Author e-mail : oparviai 'at' iki.fi
/// WWW           : http://www.surina.net
///
////////////////////////////////////////////////////////////////////////////////
//
// $Id: SoundTouch.java 211 2015-05-15 00:07:10Z oparviai $
//
////////////////////////////////////////////////////////////////////////////////

package com.soundtouch.android.helper;

public final class SoundTouchHelper
{
    // Native interface function that returns SoundTouch version string.
    // This invokes the native c++ routine defined in "soundtouch-jni.cpp".
    public native final static String getVersionString();
    
    public native final static void setTempo(long handle, float tempo);

    public native final static void setPitchSemiTones(long handle, float pitch);

    public native final static void setSpeed(long handle, float speed);

    public native final static int processFile(long handle, String inputFile, String outputFile);

    public native final static String getErrorString();

    public native final static long newInstance();
    
    public native final static void deleteInstance(long handle);

    public native final static void getSoundTouchParams(long handle);
    
    // Load the native library upon startup
    static
    {
        System.loadLibrary("soundtouch");
    }
}
