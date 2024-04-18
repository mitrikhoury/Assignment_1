package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btd;
    private Button btAdd;
    private Button btSub;
    private Button btMul;

    private Button ShapeBt;
   // mitri
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        values();
        btAdd.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,AddActivity.class);
            startActivity(intent);
        });

        btSub.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,SubtractActivity.class);
            startActivity(intent);
        });

        btMul.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,MultiplicationActivity.class);
            startActivity(intent);
        });

        btd.setOnClickListener( v -> {
           Intent intenet = new Intent(MainActivity.this , OertionD.class);
           startActivity(intenet);
                }
                );

        ShapeBt.setOnClickListener(v -> {
            Intent intenet = new Intent(MainActivity.this , tra.class);
            startActivity(intenet);
        });


    }
    public void values(){
        btAdd=findViewById(R.id.btAdd);
        btSub=findViewById(R.id.btSub);
        btMul=findViewById(R.id.btMul);
        btd=findViewById(R.id.btd);
        ShapeBt=findViewById(R.id.ShapeBt);
    }
}