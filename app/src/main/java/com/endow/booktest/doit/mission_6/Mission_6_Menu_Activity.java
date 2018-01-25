package com.endow.booktest.doit.mission_6;

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

public class Mission_6_Menu_Activity extends AppCompatActivity{

    public static int REQUEST_MENU_CODE = 201;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission_6_menu);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(data != null){
            String name = data.getStringExtra("name");
            Toast.makeText(this, name + " 에서 옴!", Toast.LENGTH_SHORT).show();
        }
    }

    public void onTest(View view){
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.button24:
                intent.setClass(this, Mission_6_Menu_1_Activity.class);
                break;
            case R.id.button25:
                intent.setClass(this, Mission_6_Menu_2_Activity.class);
                break;
            case  R.id.button26:
                intent.setClass(this, Mission_6_Menu_3_Activity.class);
                break;
        }


        startActivityForResult(intent, REQUEST_MENU_CODE);

    }

}
