package com.example.android_interfaces_java;

import android.util.Log;

import com.example.android_interfaces_java.Interfaces.GroundTravel;
import com.example.android_interfaces_java.Vehicle;

public class Moped extends Vehicle implements GroundTravel {
    @Override
    public void drive() {
        Log.i("traveling"," Moped puts along on 2 wheels");

    }

    @Override
    void travel() {
        drive();
    }
}
