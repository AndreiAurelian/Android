package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txt;
    MySharedPreference sh2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt = (TextView) findViewById(R.id.txt2);
        sh2 = new MySharedPreference(getApplicationContext());
        String rezultat = sh2.getValue();
        String namestr = getIntent().getStringExtra("code");
        txt.setText(rezultat + " " + namestr);

    }
}
