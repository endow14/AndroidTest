package com.endow.booktest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by endow14 on 2018. 1. 25..
 */

public class Test_3_Service_Activity extends AppCompatActivity {

    EditText _editText;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_3_service);

        _editText = findViewById(R.id.editText);

        Intent passedIntent = getIntent();
        processIntent(passedIntent);
    }

    @Override
    protected void onNewIntent(Intent intent) {

        processIntent(intent);

        super.onNewIntent(intent);
    }

    private void processIntent(Intent intent){

        if(intent != null){
            String command = intent.getStringExtra("command");
            String name = intent.getStringExtra("name");

            Toast.makeText(getApplicationContext(), "command : " + command + ", name : " + name, Toast.LENGTH_SHORT).show();
        }
    }

    public void onTest(View view){

        Intent intent = new Intent(this, Test_3_SampleService.class);
        intent.putExtra("command", "show");
        intent.putExtra("name", _editText.getText().toString());

        startService(intent);
    }

}
