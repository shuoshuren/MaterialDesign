package com.example.xiao.materialdesign;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ClockActivity extends AppCompatActivity {

    private ImageView mClockImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);

        setTitle("SVG矢量动画");

        mClockImg = (ImageView) findViewById(R.id.clock);
        mClockImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animate();
            }
        });
    }

    private void animate() {
        Drawable drawable = mClockImg.getDrawable();
        if(drawable instanceof Animatable){
            ((Animatable) drawable).start();
        }

    }
}
