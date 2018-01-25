package com.endow.booktest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by endow14 on 2018. 1. 25..
 */

public class Test_3_Sms_Activity extends AppCompatActivity {

    EditText _editText;
    EditText _editText2;
    EditText _editText3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_3_sms);

        _editText = findViewById(R.id.editText);
        _editText2 = findViewById(R.id.editText2);
        _editText3 = findViewById(R.id.editText3);

        Button btn = findViewById(R.id.button24);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        processIntent(getIntent());
    }


    @Override
    protected void onNewIntent(Intent intent) {

        processIntent(intent);

        super.onNewIntent(intent);
    }

    private void processIntent(Intent intent){
        if(intent != null){
            String sender = intent.getStringExtra("sender");
            String contents = intent.getStringExtra("contents");
            String receivedDate = intent.getStringExtra("receivedDate");

            _editText.setText(sender);
            _editText2.setText(contents);
            _editText3.setText(receivedDate);
        }
    }
}
