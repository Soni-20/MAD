package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    boolean isAllFieldsChecked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText t1=(EditText) findViewById(R.id.firstname);
                EditText t2=(EditText) findViewById(R.id.lastname);
                EditText t3=(EditText) findViewById(R.id.dob);
                EditText t4=(EditText) findViewById(R.id.age);
                String s1=t1.getText().toString();
                String s2=t2.getText().toString();
                String s3=t3.getText().toString();
                String s4=t4.getText().toString();
                RadioGroup r1 = (RadioGroup) findViewById(R.id.radiogroup);
                r1.getCheckedRadioButtonId();
                CheckBox c1=(CheckBox) findViewById(R.id.checkBox);
                CheckBox c2=(CheckBox) findViewById(R.id.checkBox1);

                if(s1.equals(""))
                {
                    Toast.makeText(MainActivity.this, "incomplete field", Toast.LENGTH_SHORT).show();
                }
                if(s2.equals(""))
                {
                    Toast.makeText(MainActivity.this, "incomplete field", Toast.LENGTH_SHORT).show();
                }
                if(s3.equals(""))
                {
                    Toast.makeText(MainActivity.this, "incomplete field", Toast.LENGTH_SHORT).show();
                }
                if(s4.equals(""))
                {
                    Toast.makeText(MainActivity.this, "incomplete field", Toast.LENGTH_SHORT).show();
                }
                if(r1.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(MainActivity.this, "not selected", Toast.LENGTH_SHORT).show();
                }
                if(!c1.isChecked() && !c2.isChecked())
                {
                    Toast.makeText(MainActivity.this, "please check", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }
}
