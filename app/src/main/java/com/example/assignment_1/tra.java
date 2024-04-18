package com.example.assignment_1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tra extends AppCompatActivity {

    private EditText edit_widthR;
    private EditText edit_heightR;
    private Button btn_calculateR;
    private TextView text_resultR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tra);
        getLinks();
        btn_calculateR.setOnClickListener(s->{
            //setValidation
            double hight =Double.parseDouble(edit_heightR.getText().toString().trim());
            double width=Double.parseDouble(edit_widthR.getText().toString().trim());
            double resutlt= 0.5* hight *width;
            text_resultR.setText("The Result is : "+resutlt);
        });

    }

    private void getLinks() {
        edit_widthR = findViewById(R.id.edit_widthR);
        edit_heightR = findViewById(R.id.edit_heightR);
        btn_calculateR = findViewById(R.id.btn_calculateR);
        text_resultR = findViewById(R.id.text_resultR);
    }
}