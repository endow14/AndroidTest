package com.endow.booktest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;


public class Test_3_SampleService extends Service {

    public static final String TAG = "Test_3_SampleService";


    public Test_3_SampleService() {

    }


    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG, "onCreate 호출됨");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if(intent == null){
            return Service.START_STICKY;
        } else {
            processCommand(intent);
        }

        return super.onStartCommand(intent, flags, startId);
    }


    private void processCommand(Intent intent){
        String command = intent.getStringExtra("command");
        String name = intent.getStringExtra("name");

        Log.d(TAG , "command : " + command + ", name : " + name);

//        for(int i=0; i < 5; i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                Log.d(TAG , "Waiting " + i + " seconds.");
//            }
//        }


        Intent showIntent = new Intent(getApplicationContext(), Test_3_Service_Activity.class);
        showIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        showIntent.putExtra("command", "show");
        showIntent.putExtra("name", name + " from service.");

        startActivity(showIntent);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
