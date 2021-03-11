package com.example.pogologie.Controlleur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pogologie.R;

public class Compteur extends AppCompatActivity {
    private Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compteur);
        bt1 = (Button) findViewById(R.id.compteur_bt1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameActivity = new Intent(Compteur.this, MainActivity.class);
                startActivity(gameActivity);
            }
        });
    }
}