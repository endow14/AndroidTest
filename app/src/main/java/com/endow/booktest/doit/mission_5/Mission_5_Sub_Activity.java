package com.endow.booktest.doit.mission_5;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.endow.booktest.R;

/**
 * Created by endow14 on 2018. 1. 25..
 */

public class Mission_5_Sub_Activity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doit_test_5_menu);
    }


    public void onTest(View view){

        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.button24:
                intent.putExtra("name", "고객관리");
                setResult(RESULT_OK, intent);
                break;
            case R.id.button25:
                intent.putExtra("name", "매출관리");
                setResult(RESULT_OK, intent);
                break;
            case  R.id.button26:
                intent.putExtra("name", "상품관리");
                setResult(RESULT_OK, intent);
                break;
            default:
                    break;
        }

        finish();

    }

}
