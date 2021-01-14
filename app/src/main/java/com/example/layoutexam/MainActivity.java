package com.example.layoutexam;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnHello;

    Button btnImg1, btnImg2;
    ImageView ivPic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollview2);

        btnImg1=findViewById(R.id.btnImg1);
        btnImg2=findViewById(R.id.btnImg2);
        ivPic=findViewById(R.id.ivPic);

        btnImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivPic.setImageResource(R.drawable.image01);
            }
        });
        btnImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivPic.setImageResource(R.drawable.image02);
            }
        });

       /* setContentView(R.layout.activity_main);

        btnHello=findViewById(R.id.btnHello);
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"안녕하세요. 반갑습니다!",Toast.LENGTH_LONG).show();
            }
        });

        //xml 없이 구현하기.
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams btnParams=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LinearLayout layout=new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.YELLOW);
        setContentView(layout, params);

        Button btnHello = new Button(this);
        btnHello.setText("인사하기");
        btnHello.setTextColor(Color.rgb(255,255,255));
        btnHello.setTextSize(30);
        btnHello.setBackgroundColor(Color.rgb(95,0,255));
        layout.addView(btnHello, btnParams);
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"안녕하세요. 반갑습니다!",Toast.LENGTH_LONG).show();
            }
        });*/
    }
}