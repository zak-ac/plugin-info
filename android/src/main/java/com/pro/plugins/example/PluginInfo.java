package com.pro.plugins.example;

import android.Manifest;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import androidx.core.app.ActivityCompat;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.JSObject;

@CapacitorPlugin(name = "PluginInfo")
public class PluginInfo extends Plugin {

    @PluginMethod
    public void getDeviceInfo(PluginCall call) {
        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.READ_PHONE_STATE}, 1);
            call.reject("Permission denied");
            return;
        }

        TelephonyManager telephonyManager = (TelephonyManager) getContext().getSystemService(getContext().TELEPHONY_SERVICE);
        String imei = telephonyManager.getDeviceId();
        String phoneNumber = telephonyManager.getLine1Number();
        String simSerialNumber = telephonyManager.getSimSerialNumber();
        String subscriberId = telephonyManager.getSubscriberId();

        JSObject ret = new JSObject();
        ret.put("imei", imei);
        ret.put("phoneNumber", phoneNumber);
        ret.put("simSerialNumber", simSerialNumber);
        ret.put("subscriberId", subscriberId);
        call.resolve(ret);
    }
}
