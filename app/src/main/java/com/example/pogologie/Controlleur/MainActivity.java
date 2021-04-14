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
    private Button button_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_main = (Button) findViewById(R.id.activity_main_btn1);

        button_main.setEnabled(true);

        button_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openCompteurActivity();}
        });

    }

    private void openCompteurActivity() {
        Intent intentCompteur = new Intent(this,Compteur.class);
        startActivity(intentCompteur);
    }
}