package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username="Soni-20";
                int password=123;
                EditText t1 =(EditText)  findViewById(R.id.username);
                EditText t2 =(EditText) findViewById(R.id.password);
                String s1 =t1.getText().toString();
                String s2= t2.getText().toString();
                if(s1.equals("Soni-20") && s2.equals(123))
                {
                    Toast.makeText(MainActivity.this, "successs", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
