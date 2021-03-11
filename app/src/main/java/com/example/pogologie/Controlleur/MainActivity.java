package com.example.pogologie.Controlleur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pogologie.R;

public class MainActivity extends AppCompatActivity {
    private TextView text_main;
    private Button button_main;
    private EditText edit_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_main = (EditText) findViewById(R.id.activity_main_et1);
        button_main = (Button) findViewById(R.id.activity_main_btn1);
        text_main = (TextView)findViewById(R.id.activity_main_tv1);

        button_main.setEnabled(false);

        edit_main.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                button_main.setEnabled(s.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        button_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameActivity = new Intent(MainActivity.this, Compteur.class);
                startActivity(gameActivity);
            }
        });

    }
}