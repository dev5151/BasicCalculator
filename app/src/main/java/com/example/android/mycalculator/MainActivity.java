package com.example.android.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num1=0;
    int temp;
    int num2=0;
    char op;
    String str;
    double result;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn13;
    Button btn14;
    Button btn15;

    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);
        btn11=findViewById(R.id.btn11);
        btn12=findViewById(R.id.btn12);
        btn13=findViewById(R.id.btn13);
        btn14=findViewById(R.id.btn14);
        btn15=findViewById(R.id.btn15);
        tv1=findViewById(R.id.textView2);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=num1*10;
                displayNum(num1);
                num2=num2*10;
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=num1*10+1;
                displayNum(num1);
                num2=num2*10+1;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=num1*10+2;
                displayNum(num1);
                num2=num2*10+2;
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=num1*10+3;
                displayNum(num1);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=num1*10+4;
                displayNum(num1);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=num1*10+5;
                displayNum(num1);
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=num1*10+6;
                displayNum(num1);
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=num1*10+7;
                displayNum(num1);
            }
        });



        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=num1*10+8;
                displayNum(num1);
            }
        });



        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=num1*10+9;
                displayNum(num1);
            }
        });


        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=temp;
                num1=0;
                op='+';
                result=num1+num2;
                displayMessage(num2,num1,'+');

            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=temp;
                num1=0;
                op='-';
                displayMessage(temp,num1,'-');
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=temp;
                num1=0;
                op='*';
                displayMessage(temp,num1,'*');
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=temp;
                num1=0;
                op='/';
                displayMessage(temp,num1,'/');
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operator(op);
            displayResult(result);



            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=0;
                temp=0;
                tv1.setText("0");

                            }
        });

    }

    public double operator(char op) {
        switch (op) {

            case ('+'):
                result = num1 + temp;
                return result;


            case ('-'):
                result = temp - num1;
                return result;


            case ('*'):
                result = temp * num1;
                return result;


            case ('/'):
                result = temp / num1;
                return result;

        }

            return -1;
    }

    private void displayNum(int num1){
        str=String.valueOf(num1);
        tv1.setText(str);
    }

    private void displayResult(double result){

        str=String.valueOf(result);
        tv1.setText(str);
    }

    private void displayMessage(int num1,int temp,char op){

        tv1.setText(temp+op+num1);

    }
}