package com.plexapp.tvcompose.demo

import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.activity.ComponentActivity
import com.example.myapplication.R
import com.plexapp.tvcompose.demo.ui.components.ColumnWithBringIntoIfChildrenAreFocusableViewModifier
import com.plexapp.tvcompose.demo.ui.components.SimpleBox

class TestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewGroup = layoutInflater.inflate(R.layout.test_activity, null)

        val composeView = SimpleBox(this)
        val frameLayout = viewGroup.findViewById<FrameLayout>(R.id.compose_view_parent)

        frameLayout.addView(composeView)

        viewGroup.findViewById<Button>(R.id.button1).setOnClickListener {
            frameLayout.removeAllViews()
            frameLayout.addView(SimpleBox(this))
        }

        viewGroup.findViewById<Button>(R.id.button2).setOnClickListener {
            frameLayout.removeAllViews()
            frameLayout.addView(ColumnWithBringIntoIfChildrenAreFocusableViewModifier(this))
        }

        setContentView(viewGroup)
    }
}




