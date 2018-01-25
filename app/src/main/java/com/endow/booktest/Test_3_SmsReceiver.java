package com.endow.booktest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_3_SmsReceiver extends BroadcastReceiver {


    public static String TAG = "Test_3_SmsReceiver";
    public SimpleDateFormat _format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i(TAG, "onReceive() 메소드 호출됨.");

        Bundle bundle = intent.getExtras();
        SmsMessage[] messages = parseSmsMessage(bundle);

        if(messages != null && messages.length > 0){

            String sender = messages[0].getOriginatingAddress();
            Log.i(TAG, "SMS sender :" + sender);

            String contents = messages[0].getMessageBody().toString();
            Log.i(TAG, "SMS contents :" + contents);

            Date receivedData = new Date(messages[0].getTimestampMillis());
            Log.i(TAG, "SMS received data :" + receivedData.toString());

            sendToActivity(context, sender, contents, receivedData);

        }

    }

    private SmsMessage[] parseSmsMessage(Bundle bundle){

        Object[] objs = (Object[]) bundle.get("pdus");
        SmsMessage[] messages = new SmsMessage[objs.length];

        for(int i=0; i < objs.length; i++){
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                String format = bundle.getString("format");
                messages[i] = SmsMessage.createFromPdu((byte[]) objs[i], format);
            } else {
                messages[i] = SmsMessage.createFromPdu((byte[]) objs[i]);
            }
        }

        return messages;
    }

    private void sendToActivity(Context context, String sender, String contents, Date receivedDate){

        Intent intent = new Intent(context, Test_3_Sms_Activity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("sender", sender);
        intent.putExtra("contents", contents);
        intent.putExtra("receivedDate", _format.format(receivedDate));

        context.startActivity(intent);
    }

}
