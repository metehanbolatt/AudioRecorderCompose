package com.metehanbolat.audiorecordercompose.playback

import java.io.File

interface AudioPlayer {
    fun playFile(file: File)
    fun stop()
}