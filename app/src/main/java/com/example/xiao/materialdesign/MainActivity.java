package com.example.xiao.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mCardViewBtn;
    private Button mShadowBtn;
    private Button mSVGBtn;
    private Button mClockBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvent();


    }

    private void initView() {
        mCardViewBtn = (Button) findViewById(R.id.seek_to_cardView);
        mShadowBtn = (Button) findViewById(R.id.seek_to_shadow);
        mSVGBtn = (Button) findViewById(R.id.seek_to_svg);
        mClockBtn = (Button) findViewById(R.id.seek_to_clock);
    }

    private void initEvent() {
        mCardViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CardViewActivity.class);
                startActivity(intent);
            }
        });
        mShadowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ShadowActivity.class);
                startActivity(intent);
            }
        });
        mSVGBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SVGActivity.class);
                startActivity(intent);
            }
        });

        mClockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ClockActivity.class);
                startActivity(intent);
            }
        });
    }
}
