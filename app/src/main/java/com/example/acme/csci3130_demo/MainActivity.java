package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView main;
    EditText entry;
    Button celebrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main = (TextView) findViewById(R.id.main);
        celebrate = (Button) findViewById(R.id.celebrate);
        entry = (EditText) findViewById(R.id.textEntry);

        celebrate.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                main.setText(entry.getText());
            }
        });
    }
}
