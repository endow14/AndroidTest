package com.endow.booktest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by endow14 on 2018. 1. 25..
 */

public class Test_3_Transform_Activity extends AppCompatActivity {

    public static final int REQUEST_CODE_SUB = 101;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_3_transform_main);


        Button btn =  findViewById(R.id.button24);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Test_3_Transform_Sub_Activity.class);
                startActivityForResult(intent, REQUEST_CODE_SUB);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE_SUB){
            Toast.makeText(getApplicationContext(),
                    "onActivityResult 메소드 호출됨 요청코드 : " + requestCode +
                            ", 결과 코드 : " + resultCode, Toast.LENGTH_LONG).show();
             if(resultCode == RESULT_OK){
                 String name = data.getExtras().getString("name");
                 Toast.makeText(getApplicationContext(), "응답으로 전달된 name : " + name, Toast.LENGTH_LONG).show();
             }
        }

    }
}
