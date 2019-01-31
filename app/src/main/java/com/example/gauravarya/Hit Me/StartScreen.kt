package com.example.gauravarya.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class StartScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)
        val intentt=intent

        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity
            val i = Intent(this@StartScreen, Main4Activity::class.java)
            startActivity(i)

            // close this activity
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }

    companion object {

        // Splash screen timer
        private val SPLASH_TIME_OUT = 3000
    }
   /* val intentt = Intent(applicationContext, MainActivity::class.java)
    //Toast.makeText(applicationContext,"-1"+c.toString(),Toast.LENGTH_SHORT).show()
    startActivity(intent)*/

}
