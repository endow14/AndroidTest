package com.endow.booktest.doit.mission_4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.endow.booktest.R;

/**
 * Created by endow14 on 2018. 1. 24..
 */

public class Doit_mission_4_Activity extends AppCompatActivity {

    EditText _editText;
    TextView _textView;

    boolean _firstMeasureTextSize = true;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doit_test_4);

        _editText = findViewById(R.id.doit_test_4_edit);
        _textView = findViewById(R.id.doit_test_4_testview);


        InputFilter[] filters = new InputFilter[1];
        filters[0] = new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                String expected = new String();
                expected += dest.subSequence(0, dstart);
                expected += source.subSequence(start, end);
                expected += dest.subSequence(dend, dest.length());

                int keep = 80 - (expected.getBytes().length - expected.length()) - (dest.length() - (dend - dstart));

                if (keep <= 0) {
                    return "";
                } else if (keep >= end - start) {
                    return null;
                } else {
                    return source.subSequence(start, start + keep);
                }
            }
        };
        _editText.setFilters(filters);

        _editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str = s.toString().getBytes().length + " / 80 바이트";
                _textView.setText(str);
            }

            @Override
            public void afterTextChanged(Editable s) { }
        });

    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        if(_firstMeasureTextSize && _editText.getWidth() > 0){
            _firstMeasureTextSize = false;

            _editText.setTextSize(TypedValue.COMPLEX_UNIT_PX, 100);
            float korSize = _editText.getPaint().measureText("한");
            _editText.setTextSize(TypedValue.COMPLEX_UNIT_PX, _editText.getWidth() / 8 / (korSize/100) );
        }

    }

    public void onSendClick(View view){

        Toast.makeText(Doit_mission_4_Activity.this, _editText.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void onExitClick(View view){

    }

}
