package com.example.launcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (getIntent().hasExtra("com.example.launcher.anything")){
            TextView tv = (TextView)findViewById(R.id.TextView);
            String text = getIntent().getExtras().getString("com.example.launcher.anything");
            tv.setText(text);
        }
    }
}
