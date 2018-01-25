package com.endow.booktest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by endow14 on 2018. 1. 24..
 */

public class Test_1_Frame_Activity extends AppCompatActivity {

    ImageView _imageView;
    ImageView _imageView2;
    int _imageIndex = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.test_1_frame);


        _imageView = findViewById(R.id.imageView2);
        _imageView2 = findViewById(R.id.imageView3);

    }

    public void onButtonClicked(View v){

        if(_imageIndex == 0) {
            _imageView.setVisibility(View.VISIBLE);
            _imageView2.setVisibility(View.INVISIBLE);

            _imageIndex = 1;
        } else {
            _imageView.setVisibility(View.INVISIBLE);
            _imageView2.setVisibility(View.VISIBLE);

            _imageIndex = 0;

        }
    }

}
