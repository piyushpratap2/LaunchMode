package com.example.launchmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }


    public void onStart(){
        super.onStart();
        btn1= findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivity1();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivity2();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivity4();
            }
        });

    }

    private void switchActivity1() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    private void switchActivity2() {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }

    private void switchActivity4() {
        Intent i = new Intent(this, MainActivity4.class);
        startActivity(i);
    }
}