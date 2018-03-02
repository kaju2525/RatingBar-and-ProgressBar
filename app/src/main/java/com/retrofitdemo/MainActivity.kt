package com.retrofitdemo

import android.graphics.Color
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



      /*  <color name="p1">#FF4081</color>
        <color name="p2">#0ece1b</color>
        <color name="p3">#1f08cf</color>
        <color name="p4">#ffea2d</color>
        <color name="p5">#0bd4c3</color>



        compile 'com.akexorcist:RoundCornerProgressBar:2.0.3'
        compile 'me.zhanghai.android.materialratingbar:library:1.0.2'
        compile 'com.android.support:cardview-v7:26.0.1'
*/


     ratingbar.setOnRatingChangeListener { ratingBar, rating ->
      Toast.makeText(applicationContext,"Your rate : $rating",Toast.LENGTH_SHORT).show()
     }


        progress_1.setProgressColor(ContextCompat.getColor(this,R.color.p1));
        progress_1.setProgressBackgroundColor(Color.parseColor("#808080"));
        progress_1.setMax(100.0f);
        progress_1.setProgress(20.0f);


        progress_2.setProgressColor(ContextCompat.getColor(this,R.color.p2));
        progress_2.setProgressBackgroundColor(Color.parseColor("#808080"));
        progress_2.setMax(100.0f);
        progress_2.setProgress(73.0f);


        progress_3.setProgressColor(ContextCompat.getColor(this,R.color.p3));
        progress_3.setProgressBackgroundColor(Color.parseColor("#808080"));
        progress_3.setMax(100.0f);
        progress_3.setProgress(57.0f);


        progress_4.setProgressColor(ContextCompat.getColor(this,R.color.p4));
        progress_4.setProgressBackgroundColor(Color.parseColor("#808080"));
        progress_4.setMax(100.0f);
        progress_4.setProgress(70.0f);

        progress_5.setProgressColor(ContextCompat.getColor(this,R.color.p5));
        progress_5.setProgressBackgroundColor(Color.parseColor("#808080"));
        progress_5.setMax(100.0f);
        progress_5.setProgress(90.0f);


    }
}


/*
RoundCornerProgressBar progress1 = (RoundCornerProgressBar) findViewById(R.id.progress_1);
progress1.setProgressColor(Color.parseColor("#ed3b27"));
progress1.setProgressBackgroundColor(Color.parseColor("#808080"));
progress1.setMax(70);
progress1.setProgress(15);

int progressColor1 = progress1.getProgressColor();
int backgroundColor1 = progress1.getProgressBackgroundColor();
int max1 = progress1.getMax();
int progress1 = progress1.getProgress();


RoundCornerProgressBar progress2 = (RoundCornerProgressBar) findViewById(R.id.progress_1);
progress2.setProgressColor(Color.parseColor("#56d2c2"));
progress2.setProgressBackgroundColor(Color.parseColor("#757575"));
progress2.setIconBackgroundColor(Color.parseColor("#38c0ae"));
progress2.setMax(550);
progress2.setProgress(147);
progress2.setIconImageResource(imageResource);

int progressColor2 = progress2.getProgressColor();
int backgroundColor2 = progress2.getProgressBackgroundColor();
int headerColor2 = progress2.getColorIconBackground();
int max2 = progress2.getMax();
int progress2 = progress2.getProgress();*/
