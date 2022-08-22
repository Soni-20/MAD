package com.example.jmj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 EditText t1 =(EditText ) findViewById(R.id.editTextTextPersonName);
                EditText  t2 =(EditText ) findViewById(R.id.editTextTextPersonName2);
                String g1 = t1.getText().toString();
                String g2 =t2.getText().toString();
                int a = Integer.parseInt(g1);
                int b =Integer.parseInt(g2);
                int r =a+b;
                TextView res=(TextView) findViewById(R.id.result);
                String r1= String.valueOf(r);
                res.setText(r1);
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText t1 =(EditText ) findViewById(R.id.editTextTextPersonName);
                EditText  t2 =(EditText ) findViewById(R.id.editTextTextPersonName2);
                String g1 = t1.getText().toString();
                String g2 =t2.getText().toString();
                int a = Integer.parseInt(g1);
                int b =Integer.parseInt(g2);
                int r =a-b;
                TextView res=(TextView) findViewById(R.id.result);
                String r1= String.valueOf(r);
                res.setText(r1);
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText t1 =(EditText ) findViewById(R.id.editTextTextPersonName);
                EditText  t2 =(EditText ) findViewById(R.id.editTextTextPersonName2);
                String g1 = t1.getText().toString();
                String g2 =t2.getText().toString();
                int a = Integer.parseInt(g1);
                int b =Integer.parseInt(g2);
                int r =a*b;
                TextView res=(TextView) findViewById(R.id.result);
                String r1= String.valueOf(r);
                res.setText(r1);
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText t1 =(EditText ) findViewById(R.id.editTextTextPersonName);
                EditText  t2 =(EditText ) findViewById(R.id.editTextTextPersonName2);
                String g1 = t1.getText().toString();
                String g2 =t2.getText().toString();
                int a = Integer.parseInt(g1);
                int b =Integer.parseInt(g2);
                int r =a/b;
                TextView res=(TextView) findViewById(R.id.result);
                String r1= String.valueOf(r);
                res.setText(r1);
            }
        });


    }
}
