package com.raqun.kotlinext

import android.content.Context
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.support.v4.content.FileProvider
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

/**
 * Gets an uri of file
 */
fun File.getUriFromFile(context: Context, authority: String): Uri {
    return if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
        FileProvider.getUriForFile(context, authority, this)
    } else {
        Uri.fromFile(this)
    }
}