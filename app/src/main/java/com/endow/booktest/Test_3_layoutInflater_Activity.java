package com.endow.booktest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

/**
 * Created by endow14 on 2018. 1. 24..
 */

public class Test_3_layoutInflater_Activity extends AppCompatActivity{

    LinearLayout _container;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_3_layoutinflater);

        _container = findViewById(R.id.test_3_layout_inflater_container);

        Button btn = findViewById(R.id.test_3_layout_inflater_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                inflater.inflate(R.layout.test_3_layoutinflater_sub, _container, true);

                CheckBox checkBox = _container.findViewById(R.id.test_3_layout_inflater_sub_checkbox);
                checkBox.setText("로딩되었어요.");
            }
        });

    }

}
