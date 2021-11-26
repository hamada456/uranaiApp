package com.example.uranaiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv:TextView = findViewById(R.id.uranaiText)
        var btn:Button = findViewById(R.id.uranaiBtn)

        btn.setOnClickListener {
            //配列を用意
            var uranai = arrayOf("大吉","中吉","小吉","凶")
            //tv.text = "大吉"

            //乱数、ランダムな数字(0123)
            var num = Random.nextInt(uranai.count())

            //numを文字列に変換しないとエラー
            //tv.text = num.toString()

            //表示
            tv.text = uranai.get(num)

        }
    }
}