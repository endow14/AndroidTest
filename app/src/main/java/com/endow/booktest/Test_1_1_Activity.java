package com.endow.booktest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by endow14 on 2018. 1. 23..
 */

public class Test_1_1_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.test_1_linear_layout);

//        LinearLayout mainLayout = new LinearLayout(this);
//        mainLayout.setOrientation(LinearLayout.VERTICAL);
//
//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//
//        Button btn = new Button(this);
//        btn.setText("Button Test 1");
//        btn.setLayoutParams(params);
//        mainLayout.addView(btn);
//
//        setContentView(mainLayout);

    }
}
