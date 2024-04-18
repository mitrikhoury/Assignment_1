package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity extends AppCompatActivity {
 private  TextView textviewstart;
 private ListView listVeiwExamples;
 private Button backAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        setvalue();
        setValueInList();
        backAdd = findViewById(R.id.backAdd);
        backAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void setValueInList(){
        listVeiwExamples=findViewById(R.id.listVeiwExamples);
        String[]  Examples = {"2 + 2 = 4","5 + 1 = 6","7 + 14 = 21","99 + 100 = 199","6 + 0 = 6","2 + 9 = 11","33 + 44 = 77","19 + 11 = 30","55 + 5 = 60" , "0 + 0 = 0"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(AddActivity.this,android.R.layout.simple_list_item_1,Examples);
        listVeiwExamples.setAdapter(adapter);
    }
    public void setvalue(){
        textviewstart = findViewById(R.id.textviewstart);
        String x ="Addition is one of the fundamental arithmetic operations, and it involves combining two or more numbers to find their total or sum. Here's an explanation of the addition operation:\n" +
                "\n" +
                "Definition:\n" +
                "Addition is a mathematical operation that represents combining two or more quantities to find their total.\n" +
                "\n" +
                "Symbol:\n" +
                "The symbol used to denote addition is \"+\". For example, in the expression \"3 + 4\", the \"+\" symbol indicates that we are adding the numbers 3 and 4 together.\n" +
                "\n" +
                "Process:\n" +
                "To perform addition, you simply combine the numbers (known as addends) together. You start with the first number and then add the second number to it. The result of the addition is called the sum.\n"+
                "Properties of Addition:\n" +
                "\n" +
                "Commutative Property: The order in which numbers are added does not change the result. For example, 3 + 4 is the same as 4 + 3, and both equal 7.\n" +"\n"+
                "Associative Property: The grouping of numbers being added does not change the result. For example, (2 + 3) + 4 is the same as 2 + (3 + 4), and both equal 9.\n" +"\n"+
                "Identity Element: The number 0 serves as the identity element for addition. Adding 0 to any number leaves the number unchanged. For example, 5 + 0 equals 5."
                +"\n"+"Examples : ";
        textviewstart.setMovementMethod(new ScrollingMovementMethod());
        textviewstart.setText(x);
    }
}