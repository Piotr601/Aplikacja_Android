package com.example.pam_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bug extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug);

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editTextTextPersonName);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editText.setText("Dzieki za feedback!!!");
            }
        });
    }
}