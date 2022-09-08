package com.example.finger_face_scan

import android.content.Context
import androidx.biometric.BiometricManager
import androidx.biometric.BiometricPrompt
import androidx.multidex.MultiDex
import io.flutter.embedding.android.FlutterFragmentActivity;

class MainActivity: FlutterFragmentActivity() {
    private val promptInfo: BiometricManager? = null

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }


}
