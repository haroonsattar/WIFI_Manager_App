package com.example.wifi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  Button btn_Wifi_on,btn_wifi_off;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTurnOn = (Button) findViewById(R.id.btnTurnOn);
        Button btnTurnOff = (Button) findViewById(R.id.btnTurnOff);

        btnTurnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifiManager.setWifiEnabled(false);
                Toast.makeText(MainActivity.this, "Wifi Turn Off", Toast.LENGTH_SHORT).show();
            }
        });
        btnTurnOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifiManager.setWifiEnabled(true);
                Toast.makeText(MainActivity.this, "Wifi Turn On", Toast.LENGTH_SHORT).show();
            }
        });

    }
}