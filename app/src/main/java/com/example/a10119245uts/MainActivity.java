package com.example.a10119245uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/*
Tanggal Pengerjaan 21 Mei 2022
NIM   : 10119245
Nama  : Apid Haryana
Kelas : IF -6
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this,WalkthroughActivity.class);

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            startActivity(intent);
            finish();
        }, 2500);
    }
}