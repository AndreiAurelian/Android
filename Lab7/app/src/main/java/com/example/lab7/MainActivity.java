package com.example.lab7;

import android.content.ActivityNotFoundException;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 100;
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textOutput = (TextView) findViewById(R.id.textOutput);
    }

    public void inputTxt(View v) {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        if(intent.resolveActivity(getPackageManager()) !=null){
            startActivityForResult(intent, 10);
        }else{
            Toast.makeText(this,"YOUR DEVICE DOESN'T SUPPORT SPEECH INPUT", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ArrayList<String> text;
        switch(requestCode){
            case 10:
                if(resultCode == RESULT_OK && data != null){
                    text = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    textOutput.setText(text.get(0));
                }
                break;
        }
    }
}