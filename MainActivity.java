package com.create.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void setT(String m){
        Toast.makeText(MainActivity.this,m, Toast.LENGTH_SHORT).show();
    }
    public void guess(View v){
        EditText editText = (EditText) findViewById(R.id.editTextNumber);

        int guessInt = Integer.parseInt(editText.getText().toString());
        if (guessInt < randomNumber) {
            setT("Lower");
        }else if (guessInt > randomNumber){
            setT("High");
        }else{
            setT("That's Right");
        }

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }
}