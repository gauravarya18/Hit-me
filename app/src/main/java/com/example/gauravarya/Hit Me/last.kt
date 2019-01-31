package com.example.gauravarya.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.R.string.cancel
import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_last.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.toast


class last : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)

        var level:String=intent.getStringExtra("val")
        textView5.text="Your Score:"+level.toLong()
        button2.setOnClickListener(){
           // val intent = Intent(applicationContext, MainActivity::class.java)
           // Toast.makeText(applicationContext,"",Toast.LENGTH_SHORT).show()
           /* var q:Long=level.toLong()
            val e = q.toString()
            var r:Long=5
            val k = r.toString()
            intent.putExtra("high", e)
            intent.putExtra("count",k)*/
            //startActivity(intent)
            finish()
            System.exit(0)


        }

        button.setOnClickListener(){val intent = Intent(applicationContext, Main4Activity::class.java)
            //val e = c.toString()
            // intent.putExtra("value", e)
            //Toast.makeText(applicationContext,"",Toast.LENGTH_SHORT).show()
           startActivity(intent)
            finish()
            //finish()
           // System.exit(0)

        }


        }




    }

