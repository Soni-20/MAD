package com.example.adapter;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    String[]name={"Newzealand","USA&quot","India","Australia","Switzerland","UAE","France","Russia","Finland","Ireland","Netherland","China","Nepal"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//get the edit text
        spinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, name);
        spinner.setAdapter(ad);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        TextView mytext=(TextView) view;
        Toast.makeText(this,"You selected"+mytext.getText(),
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
