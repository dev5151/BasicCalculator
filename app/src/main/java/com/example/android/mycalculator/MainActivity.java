package com.example.android.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

int result=0;
EditText edt1;
EditText edt2;
Button btn1;
Button btn2;
Button btn3;
Button btn4;
Button btn5;
TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.editText1);
        edt2 = findViewById(R.id.editText2);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        tv1= findViewById(R.id.textView1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1 = edt1.getText().toString();
                int num1 = Integer.parseInt(str1);

                String str2 = edt2.getText().toString();
                int num2 = Integer.parseInt(str2);

                result = num1 + num2;

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = edt1.getText().toString();
                int num1 = Integer.parseInt(str1);

                String str2 = edt2.getText().toString();
                int num2 = Integer.parseInt(str2);

                result = num1 - num2;


            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1 = edt1.getText().toString();
                int num1 = Integer.parseInt(str1);

                String str2 = edt2.getText().toString();
                int num2 = Integer.parseInt(str2);

                result = num1 * num2;
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1 = edt1.getText().toString();
                int num1 = Integer.parseInt(str1);

                String str2 = edt2.getText().toString();
                int num2 = Integer.parseInt(str2);

                result = num1 / num2;

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            displayOutput(result);

            }
        });
    }


    private void displayOutput(int result){
        tv1.setText(result);
    }

}
