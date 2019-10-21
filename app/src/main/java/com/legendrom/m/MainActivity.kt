package com.legendrom.m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Your IDE likely can auto-import these classes, but there are several
// different implementations so we list them here to disambiguate
import android.Manifest
import android.util.Size
import android.graphics.Matrix
import java.util.concurrent.TimeUnit

// This is an arbitrary number we are using to keep tab of the permission
// request. Where an app has multiple context for requesting permission,
// this can help differentiate the different contexts
private const val REQUEST_CODE_PERMISSIONS = 10

// This is an array of all the permission specified in the manifest
private val REQUIRED_PERMISSIONS = arrayOf(Manifest.permission.CAMERA)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
