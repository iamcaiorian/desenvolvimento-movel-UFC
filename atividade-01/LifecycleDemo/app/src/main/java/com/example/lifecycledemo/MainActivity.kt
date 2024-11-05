package com.example.lifecycledemo

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import android.util.Log
import android.widget.Toast

class MainActivity : ComponentActivity() {
    private lateinit var lifecycleStatusView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleStatusView = TextView(this).apply {
            text = "App iniciado: onCreate executado"
            textSize = 16f
        }
        setContentView(lifecycleStatusView)

        Log.i("LifecycleExample", "onCreate foi executado")
        Toast.makeText(this, "onCreate foi executado", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()

        updateLifecycleStatus("onStart executado")
        Log.i("LifecycleExample", "onStart foi chamado")
        Toast.makeText(this, "onStart foi chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        updateLifecycleStatus("onResume executado")
        Log.i("LifecycleExample", "onResume foi chamado")
        Toast.makeText(this, "onResume foi chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        updateLifecycleStatus("onPause executado")
        Log.i("LifecycleExample", "onPause foi chamado")
        Toast.makeText(this, "onPause foi chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        updateLifecycleStatus("onStop executado")
        Log.i("LifecycleExample", "onStop foi chamado")
    }

    override fun onDestroy() {
        super.onDestroy()

        updateLifecycleStatus("onDestroy executado")
        Log.i("LifecycleExample", "onDestroy foi chamado")
    }

    private fun updateLifecycleStatus(status: String) {
        lifecycleStatusView.text = status
    }
}
