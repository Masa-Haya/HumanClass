package jp.techacademy.masayuki.humanclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("ポチ",3)
        val human2 = Human("ぽち",3)

        human1.say()
        human2.think()
    }
}

