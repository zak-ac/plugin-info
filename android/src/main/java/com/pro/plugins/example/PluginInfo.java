package com.pro.plugins.example;

import android.util.Log;

public class PluginInfo {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
