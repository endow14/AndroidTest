package com.endow.booktest;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by endow14 on 2018. 1. 25..
 */

public class Test_3_SimpleData implements Parcelable {

    int _number;
    String _message;


    public Test_3_SimpleData(int number, String message) {
        _number = number;
        _message = message;
    }

    public Test_3_SimpleData(Parcel src) {
        _number = src.readInt();
        _message = src.readString();
    }

    public int getNumber() {
        return _number;
    }

    public String getMessage() {
        return _message;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator<Test_3_SimpleData>(){

        @Override
        public Test_3_SimpleData createFromParcel(Parcel source) {
            return new Test_3_SimpleData(source);
        }

        @Override
        public Test_3_SimpleData[] newArray(int size) {
            return new Test_3_SimpleData[0];
        }
    };



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(_number);
        dest.writeString(_message);
    }

}
