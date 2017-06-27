package com.example.cui.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewById = (TextView) findViewById(R.id.da);
        Toast.makeText(this, "da", Toast.LENGTH_SHORT).show();
        onRestart();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
    }
}

