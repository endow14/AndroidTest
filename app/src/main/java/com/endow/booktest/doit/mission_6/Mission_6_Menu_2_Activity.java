package com.endow.booktest.doit.mission_6;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.endow.booktest.R;
import com.endow.booktest.doit.mission_4.Mission_4_Main_Activity;

/**
 * Created by endow14 on 2018. 1. 25..
 */

public class Mission_6_Menu_2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission_6_menu_2);
    }

    public void onTest(View view){

        switch (view.getId()){
            case R.id.button24:
                Intent intent = new Intent();
                intent.putExtra("name", "매출관리");
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.button25:
                Intent mainIntent = new Intent(getApplicationContext(), Mission_6_Main_Activity.class);
                mainIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                mainIntent.putExtra("name", "매출관리");
                startActivity(mainIntent);
                finish();
                break;
        }
    }
}
