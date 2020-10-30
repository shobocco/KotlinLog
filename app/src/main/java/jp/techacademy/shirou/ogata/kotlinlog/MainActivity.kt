package jp.techacademy.shirou.ogata.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val takashi = Human("たかし",18,"勉強")
        val manami = Human("まなみ",12,"ロシア")

        takashi.say()
        takashi.think()

        manami.say()
        manami.think()


    }
}
