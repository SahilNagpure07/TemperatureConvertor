package com.example.temperatureconvertor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var inp: EditText
    lateinit var out: TextView
    lateinit var ctf: Button
    lateinit var ftc: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inp = findViewById(R.id.inp)
        out = findViewById(R.id.out)
        ctf = findViewById(R.id.ctf)
        ftc = findViewById(R.id.ftc)
    }

    fun ftoc(view: View) {
        val a = inp.text.toString().toFloat()
        val result = ((a - 32) * 5) / 9
        val res = String.format("%.2f", result)
        out.text = res
    }
    fun ctof(view: View) {
        val a = inp.text.toString().toFloat()
        val result = (a * 1.8) + 32
        val res = String.format("%.2f",result)
        out.text = res
    }
}