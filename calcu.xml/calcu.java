package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity<button> extends AppCompatActivity {
    private EditText calculation,RESULT;
    private String curr,res;
    private Button one1,CLR,BACKSPACE,two2,three3,plus,four4,five5,six6,minus,seven7,eight8,nine9,multiply,
            zero0,dot,division,equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        curr="";
        calculation=(EditText) findViewById(R.id.calculation);
        RESULT =(EditText) findViewById(R.id.RESULT);
        one1= (Button) findViewById(R.id.one1);
        CLR= (Button) findViewById(R.id.CLR);
        BACKSPACE=(Button) findViewById(R.id.BACKSPACE);
        two2=(Button) findViewById(R.id.two2);
        three3=(Button) findViewById(R.id.three3);
        plus=(Button) findViewById(R.id.plus);
        four4=(Button) findViewById(R.id.four4);
        five5 =(Button) findViewById(R.id.five5);
        six6=(Button) findViewById(R.id.six6);
        minus=(Button) findViewById(R.id.minus);
        seven7 =(Button) findViewById(R.id.seven7);
        eight8=(Button) findViewById(R.id.eight8);
        nine9=(Button) findViewById(R.id.nine9);
        multiply=(Button) findViewById(R.id.multiply);
        zero0=(Button) findViewById(R.id.zero0);
        dot=(Button) findViewById(R.id.dot);
        division=(Button) findViewById(R.id.division);
        equal=(Button) findViewById(R.id.equal);

        zero0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr=curr+"0";
                displayOne();
            }
        });
        one1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr=curr+"1";
                displayOne();
            }
        });
        two2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr=curr+"2";
            }
        });
        three3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr=curr+"3";
            }
        });
        four4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr=curr+"4";
            }
        });
        five5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr=curr+"5";
            }
        });
        six6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr=curr+"6";
            }
        });
        seven7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr=curr+"7";
            }
        });
        six6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr=curr+"8";
            }
        });
        six6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr=curr+"9";
            }
        });

    }
    public void displayOne(){

        calculation.setText(String.valueOf(curr));
    }
    public void displayTwo(){

        calculation.setText(res);
    }



