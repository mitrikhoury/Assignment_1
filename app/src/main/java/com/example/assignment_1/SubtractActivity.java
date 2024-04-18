package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubtractActivity extends AppCompatActivity {

    private TextView textViewSub;

    private ListView SubListVeiw;

    private Button SubBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtract);
        setValueText();
        setValueForList();

        SubBack = findViewById(R.id.DivBack);
        SubBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubtractActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }

    public void setValueForList(){

        SubListVeiw=findViewById(R.id.DivListVeiw);
        String[]  Examples = {"5 - 2 = 3","55 - 1 = 54","45 - 14 = 31","99 - 100 = -1","6 - 0 = 6","78 - 10 = 68","33 - 4 = 29","19 - 11 = 8","15 - 5 = 10" , "1 - 1 = 0"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SubtractActivity.this,android.R.layout.simple_list_item_1,Examples);
        SubListVeiw.setAdapter(adapter);
    }

    public void setValueText(){
        textViewSub = findViewById(R.id.DivText);
        String y ="Subtraction is a fundamental arithmetic operation that involves finding the difference between two numbers. Here's a concise explanation:\n" +
                "\n" +
                "Definition:\n" +
                "Subtraction is the process of taking one number away from another to find the difference or remainder.\n" +
                "\n" +
                "Symbol:\n" +
                "The symbol used to denote subtraction is \"-\". For example, in the expression \"10 - 4\", the \"-\" symbol indicates that we are subtracting 4 from 10.\n" +
                "\n" +
                "Process:\n" +
                "To perform subtraction, you take one number (the subtrahend) away from another number (the minuend). The result of the subtraction is called the difference."+
                "Properties of Subtraction:\n" +
                "\n" +
                "Subtraction is not commutative: Changing the order of numbers changes the result. For example, 10 - 4 is not the same as 4 - 10.\n" +"\n"+
                "Subtraction is not associative: Changing the grouping of numbers changes the result. For example, (10 - 4) - 2 is not the same as 10 - (4 - 2).\n" +"\n"+
                "Identity Element: Subtracting 0 from any number leaves the number unchanged. For example, 10 - 0 equals 10."+"\n"+"Examples :";

        textViewSub.setText(y);

    }

}