package com.plexapp.tvcompose.demo

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import com.example.myapplication.R
import com.plexapp.tvcompose.demo.ui.components.SimpleBox

class TestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewGroup = layoutInflater.inflate(R.layout.test_activity, null)

        val composeView = SimpleBox(this)

        val linearLayout = viewGroup.findViewById<LinearLayout>(R.id.test)

        linearLayout.addView(composeView)

        setContentView(viewGroup)
    }
}




