package com.example.launcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent= new Intent(getApplicationContext(),Main2Activity.class);
                startIntent.putExtra("com.example.launcher.anything", "Hello World!");
                startActivity(startIntent);
            }
        });
        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://www.google.com";
                Uri webaddress = Uri.parse(google);
                Intent gotogoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotogoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotogoogle);
                }
            }
        });
    }
}
