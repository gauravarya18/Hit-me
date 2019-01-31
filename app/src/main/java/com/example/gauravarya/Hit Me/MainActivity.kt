package com.example.gauravarya.myapplication

import android.content.Intent
import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import android.view.View.X



class MainActivity : AppCompatActivity() {


    var score:Long=0
    var imagearray=ArrayList<ImageView>()
     var Handler :Handler = Handler()
    var runable : Runnable = Runnable {  }


    var Handle :Handler = Handler()
    var runabl : Runnable = Runnable {  }
    var p0:Long=20000
    var r:Long=20
     var i:Long=0
    var max:Long=0

    var high:Long=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        score=0
        imagearray= arrayListOf(imageView,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10,imageView12,imageView13,imageView14,imageView15,imageView16,imageView17,imageView18,imageView11,imageView19,imageView20,imageView23,imageView24,imageView25,imageView26,imageView27,imageView22,imageView22)
       hideimage()



        //imagearray= arrayListOf(imageView19,imageView20,imageView23,imageView24,imageView25,imageView26,imageView27,imageView22,imageView22)
       // gian()



        object :CountDownTimer(20000,1000){

           override fun onFinish() {
               textView.text="Time:0"
               Handler.removeCallbacks(runable)
               for(image in imagearray)
               { image.visibility=View.INVISIBLE}

              /* var highs:String=intent.getStringExtra("high")
               var count:String=intent.getStringExtra("count")
               var k:Long=count.toLong()

               var q:Long=highs.toLong()
               if(max>q){
                   max=q

               }*/

          //   val intent =Intent(applicationContext,finish::class.java)
              // val bundle = Bundle()
               //bundle.putLong("high",max)
             // intent.putExtras(bundle)
              // intent.putExtra("MY_KEY",max)
             // var x:String="High Score" + max
               val i = Intent(applicationContext,last::class.java)
                val e = max.toString()
                i.putExtra("val", e)
               startActivity(i)
               finish()


           }

             override fun onTick(p0 :Long) {
               textView.text="Time:" + p0/1000

                  r= p0/1000
           }
        }.start()


    }

    fun bonus(view: View){
        if(i!=r)
            score=score+2

        if(score>max)
            max=score

        i=r

        textView2.text="Score:"+ score
        Toast.makeText(applicationContext,"BONUS +2",Toast.LENGTH_SHORT).show()
    }


    fun increasescore(view: View){
        if(i!=r)
        score++

        //max=score
        if(score>max)
            max=score
     //  var p=score
       // if(p>max)
         //   max= p.toLong()

       // var high:




       // var i:Long=0
        i=r

        textView2.text="Score:"+ score
       Toast.makeText(applicationContext,"+1",Toast.LENGTH_SHORT).show()


    }





    fun hideimage()
    {

        runable = object : Runnable {
            override fun run(){
                for(image in imagearray)
                {image.visibility=View.INVISIBLE}

                 val random=Random()
                val index=random.nextInt(26-0)
                imagearray[index].visibility=View.VISIBLE
                var level:String=intent.getStringExtra("value")



                Handler.postDelayed(runable, level.toLong())





            }

        }


        Handler.post(runable)
    }






  fun decrease(view: View){
      if(i!=r)
          score--

      if(score>max)
          max=score
      i=r

      textView2.text="Score:"+ score
      Toast.makeText(applicationContext,"-1",Toast.LENGTH_SHORT).show()


  }



}
