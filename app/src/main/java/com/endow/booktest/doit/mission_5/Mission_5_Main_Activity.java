package com.endow.booktest.doit.mission_5;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.endow.booktest.R;

/**
 * Created by endow14 on 2018. 1. 25..
 */

public class Mission_5_Main_Activity extends AppCompatActivity {

    public static int REQUST_TEST = 200;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doit_test_5_main);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if(requestCode == REQUST_TEST && resultCode == RESULT_OK && data != null){
            String name = data.getStringExtra("name");
            Toast.makeText(this, name + "버튼 클릭!", Toast.LENGTH_SHORT).show();
        }

    }

    public void onTest(View view){
        Intent intent = new Intent(this, Mission_5_Sub_Activity.class);
        startActivityForResult(intent, REQUST_TEST);
    }
}
