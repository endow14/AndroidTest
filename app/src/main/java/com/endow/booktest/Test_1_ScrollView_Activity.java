package com.endow.booktest;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

/**
 * Created by endow14 on 2018. 1. 23..
 */

public class Test_1_ScrollView_Activity extends AppCompatActivity {

    ScrollView _scrollView;
    ImageView _imageView;
    BitmapDrawable _bitmap;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_1_scrollview);

        _scrollView = findViewById(R.id.scrollView);
        _imageView = findViewById(R.id.imageView);
        _scrollView.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        _bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image01);
        int bitmapWidth = _bitmap.getIntrinsicWidth();
        int bitmapHeight = _bitmap.getIntrinsicHeight();

        _imageView.setImageDrawable(_bitmap);
        _imageView.getLayoutParams().width = bitmapWidth;
        _imageView.getLayoutParams().height = bitmapHeight;

    }

    public void onButtonClicked(View v){
        Resources res = getResources();
        _bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image02);
        int bitmapWidth = _bitmap.getIntrinsicWidth();
        int bitmapHeight = _bitmap.getIntrinsicHeight();

        _imageView.setImageDrawable(_bitmap);
        _imageView.getLayoutParams().width = bitmapWidth;
        _imageView.getLayoutParams().height = bitmapHeight;
    }
}
