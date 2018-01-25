package com.endow.booktest;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;

/**
 * Created by endow14 on 2018. 1. 25..
 */

public class Test_3_PDFView_Activity extends AppCompatActivity {


    EditText _editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_3_pdfview);

        _editText = findViewById(R.id.pdfview);
    }


    public void onTest(View view){

        String fileName = _editText.getText().toString();
        if(fileName.length() > 0){
            openPDF(fileName);
        } else {
            Toast.makeText(getApplicationContext(), "PDF 파일명을 입력하세요", Toast.LENGTH_SHORT).show();
        }

    }

    private void openPDF(String fileName){

        String sdcardFolder = Environment.getExternalStorageDirectory().getAbsolutePath();
        String filePath = sdcardFolder + File.separator + fileName;

        File file = new File(filePath);

        if(file.exists()){
            Uri uri = Uri.fromFile(file);

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(uri, "application/pdf");

            try {
                startActivity(intent);
            }catch (ActivityNotFoundException ex){
                Toast.makeText(getApplicationContext(), "PDF 파일을 보기 위한 뷰어 앱이 없습니다", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(getApplicationContext(), "PDF 파일이 없습니다 " , Toast.LENGTH_SHORT).show();
        }



    }

}
