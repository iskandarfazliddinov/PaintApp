package com.yourapplicationname.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paintapp.databinding.ActivityMainBinding
import com.yourapplicationname.paintapp.PaintView.Companion.colorList
import com.yourapplicationname.paintapp.PaintView.Companion.currentBrush
import com.yourapplicationname.paintapp.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        supportActionBar?.hide()
        setContentView(binding.root)

        binding.apply {
            redColor.setOnClickListener {
                paintBrush.color = Color.RED
                currentColor(paintBrush.color)
            }
            blueColor.setOnClickListener {
                paintBrush.color = Color.BLUE
                currentColor(paintBrush.color)
            }
            blackColor.setOnClickListener {
                paintBrush.color = Color.BLACK
                currentColor(paintBrush.color)
            }
            witeColor.setOnClickListener {
                pathList.clear()
                colorList.clear()
                path.reset()
            }
        }

    }

    private fun currentColor(color: Int) {
        currentBrush = color
        path = Path()
    }
}