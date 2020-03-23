package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button btn1,btn2,btn3;

    public EditText etxt;

    MySharedPreference sh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (Button)findViewById(R.id.btn);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        etxt = (EditText)findViewById(R.id.edTxt);
        sh = new MySharedPreference(getApplicationContext());


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namestr = "Orice";
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("code",namestr);
                startActivity(intent);   
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = etxt.getText().toString();
                sh.save(i);

                Toast toast = Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG);
                toast.show();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });
    }
}
