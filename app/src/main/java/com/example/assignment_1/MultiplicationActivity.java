package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
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



public class MultiplicationActivity extends AppCompatActivity {

    private TextView TextviewStart;
    private ListView ListMult;
    private Button BackMultBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication);
        setValueForText();
        setListValue();
        BackMultBt=findViewById(R.id.BackMultBt);
        BackMultBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MultiplicationActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void setListValue(){
        ListMult=findViewById(R.id.ListMult);
        String[]  Examples = {"7 * 2 = 14","55 * 1 = 55","4 * 5 = 20","9 * 9 = 81","6 * 0 = 0","7 * 8 = 56","3 * 4 = 12","1 * 1 = 1","15 * 5 = 75" , "12 * 2 = 24"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MultiplicationActivity.this,android.R.layout.simple_list_item_1,Examples);
        ListMult.setAdapter(adapter);
    }

    public void setValueForText(){
        TextviewStart = findViewById(R.id.TextviewStart);
        String Text ="Multiplication is combining equal groups of numbers to find their total product, denoted by the symbol \"*\".\n" +
                "\n" +
                "Definition:\n" +
                "Multiplication is a mathematical operation that represents combining equal groups of numbers to find their total product.\n" +
                "\n" +
                "Symbol:\n" +
                "The symbol used to denote multiplication is \"\\times\" or \"*\". For example, in the expression \"3 * 4\", the symbol indicates that we are multiplying the numbers 3 and 4 together.\n" +
                "\n" +
                "Process:\n" +
                "To perform multiplication, you repeatedly add one number (the multiplicand) to itself as many times as indicated by the other number (the multiplier). The result of the multiplication is called the product.\n" +
                "\n" +
                "Properties of Multiplication:\n" +
                "\n" +
                "Commutative Property:\n" +
                "The order in which numbers are multiplied does not change the result. For example, 3×4 is the same as 4×3 and both equal 12.\n" +
                "\n" +
                "Associative Property:\n" +
                "The grouping of numbers being multiplied does not change the result. For example,  (2×3)×4 is the same as 2×(3×4), and both equal 24.\n" +
                "\n" +
                "Identity Element:\n" +
                "The number 1 serves as the identity element for multiplication. Multiplying any number by 1 leaves the number unchanged. For example, 5×1 equals 5." +"\n"+ "Examples :";

        TextviewStart.setText(Text);
    }
}