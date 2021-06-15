package com.example.pam_project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText edit1;
    Button but2;

    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edit1 = (EditText) findViewById(R.id.editTextTextPersonName2);
        but2 = (Button) findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                    string = edit1.getText().toString();
                    edit1.setText(":)");
                }
                 catch (NumberFormatException e) {
                    edit1.setText(":(");
                }
            }
        });



    }
}