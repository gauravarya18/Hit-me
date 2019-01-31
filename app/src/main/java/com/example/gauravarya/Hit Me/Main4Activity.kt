package com.example.gauravarya.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.gauravarya.TestActivity
import kotlinx.android.synthetic.main.activity_main4.*
import org.jetbrains.anko.indeterminateProgressDialog


class Main4Activity : AppCompatActivity() {

    var c: Int = 400
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val easy: Button = findViewById(R.id.easybt)
        easy.setOnClickListener {
            c = 500
            Toast.makeText(applicationContext, "Easy Selected", Toast.LENGTH_SHORT).show()


        }
        val medium: Button = findViewById(R.id.mediumbt)
        medium.setOnClickListener {
            c = 400
            Toast.makeText(applicationContext, "Medium Selected", Toast.LENGTH_SHORT).show()


        }
        val hard: Button = findViewById(R.id.hardbt)
        hard.setOnClickListener {
            c = 300
            Toast.makeText(applicationContext, "Hard Selected", Toast.LENGTH_SHORT).show()


        }

        val help: Button = findViewById(R.id.help)
        help.setOnClickListener {
          //  Toast.makeText(applicationContext, "Help Wanted", Toast.LENGTH_SHORT).show()

            val intent =Intent(applicationContext,TestActivity::class.java)
            startActivity(intent)


        }

        val r: Button = findViewById(R.id.about)
        about.setOnClickListener {
            //  Toast.makeText(applicationContext, "Help Wanted", Toast.LENGTH_SHORT).show()

            val intent =Intent(applicationContext,com.example.gauravarya.about::class.java)
            startActivity(intent)


        }
      //  val intent = intent





    }

    companion object {

        // Splash screen timer
        private val SPLASH_TIME_OUT = 1500}

    fun play(view: View) {

        Handler().postDelayed(
        {
            indeterminateProgressDialog("GAME ON!!!").show()


            finish()
        }, SPLASH_TIME_OUT.toLong())




        val intent = Intent(applicationContext, MainActivity::class.java)
        val e = c.toString()
        intent.putExtra("value", e)
        //Toast.makeText(applicationContext,"-1"+c.toString(),Toast.LENGTH_SHORT).show()
        startActivity(intent)

    }



    }


