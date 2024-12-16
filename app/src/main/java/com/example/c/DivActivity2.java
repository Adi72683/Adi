package com.example.c;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DivActivity2 extends AppCompatActivity {

    Button div;
    EditText et1;
    EditText et2;
    String getNum1,getNum2,res;
    int num1,num2,rem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_div2);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        div=(Button) findViewById(R.id.divbut);

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                rem=num1/num2;
                res=String.valueOf(rem);
                Toast.makeText(getApplicationContext(),res, Toast.LENGTH_LONG).show();
            }

        });



    }
}