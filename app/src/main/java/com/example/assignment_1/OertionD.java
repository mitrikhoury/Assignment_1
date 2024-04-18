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

public class OertionD extends AppCompatActivity {


    private TextView DivText1;
    private ListView divListVeiw;
    private Button btBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oertion_d);

        setvalue();
        setValueInList();
        btBack = findViewById(R.id.btBack);
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OertionD.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    public void setValueInList(){
        divListVeiw=findViewById(R.id.divListVeiw);
        String[]  Examples = {"12 ÷ 3 = 4 ","20 ÷ 5 = 4","15 ÷ 3 = 5","36 ÷ 6 = 6 ","25 ÷ 5 = 5","48 ÷ 8 = 6","30 ÷ 3 = 10 ","42 ÷ 7 = 6","18 ÷ 2 = 9" , "50 ÷ 10 = 5"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(OertionD.this,android.R.layout.simple_list_item_1,Examples);
        divListVeiw.setAdapter(adapter);
    }

    public void setvalue(){
        DivText1 = findViewById(R.id.DivText1);
        String x ="Here's an explanation of the division operation:\n" +
                "\n" +
                "Definition:\n" +
                "Division is a mathematical operation that represents splitting a quantity into equal parts or finding out how many times one number is contained within another.\n" +
                "\n" +
                "Symbol:\n" +
                "The symbol used to denote division is \"÷\" or \"/\". For example, in the expression \"6 ÷ 2\" or \"6 / 2\", the \"÷\" or \"/\" symbol indicates that we are dividing the number 6 by the number 2.\n" +
                "\n" +
                "Process:\n" +
                "To perform division, you start with the dividend (the number being divided) and divide it by the divisor (the number by which the dividend is being divided). The result of the division is called the quotient.\n" +
                "\n" +
                "Properties of Division:\n" +
                "\n" +
                "Commutative Property: Unlike addition and multiplication, division is not commutative. Changing the order of numbers changes the result. For example, 6 ÷ 2 is not the same as 2 ÷ 6.\n" +"\n"+
                "Associative Property: Similar to addition and multiplication, division is also associative. The grouping of numbers being divided does not change the result. For example, (8 ÷ 4) ÷ 2 is the same as 8 ÷ (4 ÷ 2), and both equal 2.\n" +"\n"+
                "Identity Element: The number 1 serves as the identity element for division. Dividing any number by 1 leaves the number unchanged. For example, 5 ÷ 1 equals 5." + "\n"+ " Example : ";
        DivText1.setText(x);
    }

}