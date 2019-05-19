package com.example.cyh.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText val1;
    private EditText val2;
    private EditText res1;
    private Button btn1;
    private EditText val3;
    private EditText val4;
    private EditText res2;
    private Button btn2;
    private EditText val5;
    private EditText val6;
    private EditText res3;
    private Button btn3;
    private EditText val7;
    private EditText val8;
    private EditText res4;
    private Button btn4;
    private EditText val9;
    private EditText res5;
    private Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //加法
        val1 = (EditText)  this.findViewById(R.id.value1);
        val2 = (EditText)  this.findViewById(R.id.value2);
        res1 = (EditText)  this.findViewById(R.id.result1);
        btn1 = (Button)    this.findViewById(R.id.Button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText1 = val1.getText().toString();
                String inputText2 = val2.getText().toString();
                int num1 = Integer.valueOf(inputText1).intValue();
                int num2 = Integer.valueOf(inputText2).intValue();
                num1 = num1+num2;
                inputText1 = String.valueOf(num1);
                res1.setText(inputText1);
            }
        });

        //减法
        val3 = (EditText)  this.findViewById(R.id.value3);
        val4 = (EditText)  this.findViewById(R.id.value4);
        res2 = (EditText)  this.findViewById(R.id.result2);
        btn2 = (Button)    this.findViewById(R.id.Button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText1 = val3.getText().toString();
                String inputText2= val4.getText().toString();
                int num1 = Integer.valueOf(inputText1).intValue();
                int num2 = Integer.valueOf(inputText2).intValue();
                num1= num1-num2;
                inputText1 = String.valueOf(num1);
                res2.setText(inputText1);
            }
        });

        //乘法
        val5 = (EditText)  this.findViewById(R.id.value5);
        val6 = (EditText)  this.findViewById(R.id.value6);
        res3 = (EditText)  this.findViewById(R.id.result3);
        btn3 = (Button)    this.findViewById(R.id.Button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText1 = val5.getText().toString();
                String inputText2= val6.getText().toString();
                int num1 = Integer.valueOf(inputText1).intValue();
                int num2 = Integer.valueOf(inputText2).intValue();
                num1= num1*num2;
                inputText1 = String.valueOf(num1);
                res3.setText(inputText1);
            }
        });

        //除法
        val7 = (EditText)  this.findViewById(R.id.value7);
        val8 = (EditText)  this.findViewById(R.id.value8);
        res4 = (EditText)  this.findViewById(R.id.result4);
        btn4 = (Button)    this.findViewById(R.id.Button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText1 = val7.getText().toString();
                String inputText2= val8.getText().toString();
                int num1 = Integer.valueOf(inputText1).intValue();
                int num2 = Integer.valueOf(inputText2).intValue();
                num1= num1/num2;
                inputText1 = String.valueOf(num1);
                res4.setText(inputText1);
            }
        });

        //开方
        val9 = (EditText)  this.findViewById(R.id.value9);
        res5 = (EditText)  this.findViewById(R.id.result5);
        btn5 = (Button)    this.findViewById(R.id.Button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText1 = val9.getText().toString();
                double num1 = Double.parseDouble(inputText1);
                 num1= Math.sqrt(num1);
                inputText1 = String.valueOf(num1);
                res5.setText(inputText1);
            }
        });
    }
}
