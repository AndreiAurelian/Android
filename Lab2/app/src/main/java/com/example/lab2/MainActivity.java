package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Log.e("testError", "ERROR !!!!   <<<-------------------- Here is the ERROR");
        Log.w("testError", "WARNING !!!!   <<<------------------- Here is the WARNING");
        Log.d("testError", "DEBUG !!!!   <<<-----            ---- Here is the DEBUG");






        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myFancyMethod(v);
            }
        });


    }


    public void push (View v){
        Toast.makeText(MainActivity.this,"You pushed the button from on create", Toast.LENGTH_LONG).show();


    }




    // some more code
    public void myFancyMethod(View v) {
        Toast.makeText(this, "You pushed the button2 from push function", Toast.LENGTH_SHORT).show();

    }

}
