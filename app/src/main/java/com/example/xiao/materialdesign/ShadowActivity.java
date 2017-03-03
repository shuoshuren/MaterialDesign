package com.example.xiao.materialdesign;

import android.graphics.Outline;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;

public class ShadowActivity extends AppCompatActivity {

    private View mShadowView;
    private Button mIncreaseZBtn;
    private Button mDecreaseZBtn;
    private CircleOutlineProvider mOutlineProviderCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shadow);

        setTitle("阴影");

        initView();
        initEvent();
    }



    private void initView() {
        mShadowView = findViewById(R.id.shadow_view);
        mIncreaseZBtn = (Button) findViewById(R.id.increase_z);
        mDecreaseZBtn = (Button) findViewById(R.id.decrease_z);

        //裁剪视图的轮廓提供者
        mOutlineProviderCircle = new CircleOutlineProvider();
        mShadowView.setOutlineProvider(mOutlineProviderCircle);
        mShadowView.setClipToOutline(true);
    }

    private void initEvent() {
        mIncreaseZBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mShadowView.setTranslationZ(mShadowView.getElevation()+10);
            }
        });

        mDecreaseZBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mShadowView.getElevation()>=10){
                    mShadowView.setElevation(mShadowView.getElevation() - 10);
                }

            }
        });

    }

    private class CircleOutlineProvider extends ViewOutlineProvider{

        @Override
        public void getOutline(View view, Outline outline) {
            //裁剪成圆形
            outline.setOval(0,0,100,100);
        }
    }


}
