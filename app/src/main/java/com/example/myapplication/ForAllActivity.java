package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ForAllActivity extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;
    ImageView imageView;
    String txt1;
    String txt2;
    String txt3;
    String txt01;
    String txt02;
    String txt03;
    String txt04;
    String txt05;
    String txt06;
    String txt07;
    String txt08;
    String txt09;
    String txt10;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_all);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        textView1=(TextView)findViewById(R.id.Titletext);
        txt2=getIntent().getStringExtra("title1");
        textView1.setText(txt2);
        textView2=(TextView)findViewById(R.id.description1);
        txt01=getIntent().getStringExtra("title3");
        textView2.setText(txt01);

        textView3=(TextView)findViewById(R.id.description2);
        txt02=getIntent().getStringExtra("title4");
        textView3.setText(txt02);

        textView4=(TextView)findViewById(R.id.description3);
        txt03=getIntent().getStringExtra("title5");
        textView4.setText(txt03);

        textView5=(TextView)findViewById(R.id.reward1);
        txt04=getIntent().getStringExtra("title6");
        textView5.setText(txt04);

        textView6=(TextView)findViewById(R.id.reward2);
        txt05=getIntent().getStringExtra("title7");
        textView6.setText(txt05);

        textView7=(TextView)findViewById(R.id.reward3);
        txt06=getIntent().getStringExtra("title8");
        textView7.setText(txt06);

        textView8=(TextView)findViewById(R.id.rule1);
        txt07=getIntent().getStringExtra("title9");
        textView8.setText(txt07);

        textView9=(TextView)findViewById(R.id.rule2);
        txt08=getIntent().getStringExtra("title10");
        textView9.setText(txt08);

        textView10=(TextView)findViewById(R.id.rule3);
        txt09=getIntent().getStringExtra("title12");
        textView10.setText(txt09);

        textView11=(TextView)findViewById(R.id.rule4);
        txt10=getIntent().getStringExtra("title13");
        textView11.setText(txt10);

        imageView=(ImageView)findViewById(R.id.ChalImage);
        image=getIntent().getIntExtra("image2",0);
        imageView.setImageResource(image);

    }
}
