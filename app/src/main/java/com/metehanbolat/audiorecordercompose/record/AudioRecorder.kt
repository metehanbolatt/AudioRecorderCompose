package com.metehanbolat.audiorecordercompose.record

import java.io.File

interface AudioRecorder {

    fun start(outputFile: File)
    fun stop()
}