package com.endow.booktest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by endow14 on 2018. 1. 25..
 */

public class Test_3_Parcelable_Activity extends AppCompatActivity {

    public static final int REQUEST_CODE_SUB = 101;
    public static final String SIMPLE_DATA = "data";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_3_parcelable_main);

    }


    public void onTest(View view){

        Intent intent = new Intent(getApplicationContext(), Test_3_Parcelable_Sub.class);
        Test_3_SimpleData data = new Test_3_SimpleData(100, "Hello Android!!!!");
        intent.putExtra(SIMPLE_DATA, data);

        startActivityForResult(intent, REQUEST_CODE_SUB);
    }

}
