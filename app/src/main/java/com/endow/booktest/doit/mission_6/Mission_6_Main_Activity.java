package com.endow.booktest.doit.mission_6;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.endow.booktest.R;

/**
 * Created by endow14 on 2018. 1. 25..
 */

public class Mission_6_Main_Activity extends AppCompatActivity {

    EditText _editText;
    EditText _editText2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission_6_main);

        _editText = findViewById(R.id.editText3);
        _editText2 = findViewById(R.id.editText4);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        if(intent != null){
            String name = intent.getStringExtra("name");
            Toast.makeText(this, name + " 에서 옴!", Toast.LENGTH_SHORT).show();
        }

    }

    public void onTest(View view){

        if(_editText.getText().length() == 0){
            Toast.makeText(this, "아이디를 입력하세요", Toast.LENGTH_SHORT).show();
            return;
        }

        if(_editText2.getText().length() == 0){
            Toast.makeText(this, "암호를 입력하세요", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, Mission_6_Menu_Activity.class);
        startActivity(intent);
    }

}
