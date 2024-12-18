package com.example.c;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity2 extends AppCompatActivity {

    EditText et1;
    EditText et2;
    Button add;
    int num1,num2,sum;
    String getNum1,getNum2,res;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add2);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        add = findViewById(R.id.addbut);
        tv= findViewById(R.id.resToDisp);
        add=(Button) findViewById(R.id.addbut);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                        sum=num1+num2;
                res=String.valueOf(sum);git a
                tv.setText(res);
                Toast.makeText(getApplicationContext(),res, Toast.LENGTH_LONG).show();

            }
        });

    }
}