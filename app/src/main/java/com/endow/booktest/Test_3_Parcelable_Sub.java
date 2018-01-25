package com.endow.booktest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by endow14 on 2018. 1. 25..
 */

public class Test_3_Parcelable_Sub extends AppCompatActivity {

    TextView _textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_3_parcelable_sub);

        _textView = findViewById(R.id.textView8);

        Intent intent = getIntent();
        processIntent(intent);
    }

    private void processIntent(Intent intent){

        if(intent != null){
            Bundle bundle = intent.getExtras();

            Test_3_SimpleData data = bundle.getParcelable(Test_3_Parcelable_Activity.SIMPLE_DATA);

            _textView.setText("전달 받은 데이터\nNumber : " + data.getNumber() + "\nMessage : " + data.getMessage());
        }
    }

    public void onTest(View view){
        finish();
    }

}
