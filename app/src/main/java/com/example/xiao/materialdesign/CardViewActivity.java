package com.example.xiao.materialdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.widget.SeekBar;

/**
 * Created by xiao on 2017/3/1.
 */

/**
 * CardView控件用于实现一个立体的卡片，提供了圆角，阴影的特效
 */
public class CardViewActivity extends AppCompatActivity {

    private CardView mCardView;
    private SeekBar mRadiusSeekBar;
    private SeekBar mElevationSeekBar;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);

        setTitle("CardView");

        initView();
        initEvent();

    }

    private void initView() {
        mCardView = (CardView) findViewById(R.id.cardview);
        mRadiusSeekBar = (SeekBar) findViewById(R.id.radius_seekbar);
        mElevationSeekBar = (SeekBar) findViewById(R.id.elevation_seekbar);
    }

    private void initEvent() {

        mRadiusSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mCardView.setRadius(progress/2);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mElevationSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mCardView.setElevation(progress/2);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
