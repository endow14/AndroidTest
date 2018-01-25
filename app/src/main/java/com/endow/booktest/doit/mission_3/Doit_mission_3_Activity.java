package com.endow.booktest.doit.mission_3;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.endow.booktest.R;

/**
 * Created by endow14 on 2018. 1. 24..
 */

public class Doit_mission_3_Activity extends AppCompatActivity {

    ImageView _imageViewUp;
    ImageView _imageViewDown;
    BitmapDrawable _bitmapDrawable;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doit_test_3);

        _imageViewUp = findViewById(R.id.imageView4);
        _imageViewDown = findViewById(R.id.imageView5);

        _bitmapDrawable = (BitmapDrawable) getResources().getDrawable(R.drawable.image01);
        int bitmapWith = _bitmapDrawable.getIntrinsicWidth();
        int bitmapHeight = _bitmapDrawable.getIntrinsicHeight();

        _imageViewUp.setImageDrawable(_bitmapDrawable);
        _imageViewUp.getLayoutParams().width = bitmapWith;
        _imageViewUp.getLayoutParams().height = bitmapHeight;
        _imageViewUp.setVisibility(View.VISIBLE);

        _imageViewDown.setImageDrawable(_bitmapDrawable);
        _imageViewDown.getLayoutParams().width = bitmapWith;
        _imageViewDown.getLayoutParams().height = bitmapHeight;
        _imageViewDown.setVisibility(View.INVISIBLE);
    }

    public void onBtnUp(View v){
        _imageViewUp.setVisibility(View.VISIBLE);
        _imageViewDown.setVisibility(View.INVISIBLE);
    }

    public void onBtnDown(View v){
        _imageViewUp.setVisibility(View.INVISIBLE);
        _imageViewDown.setVisibility(View.VISIBLE);
    }

}
