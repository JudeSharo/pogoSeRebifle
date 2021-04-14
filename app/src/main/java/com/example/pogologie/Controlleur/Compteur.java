package com.example.pogologie.Controlleur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pogologie.R;

import java.util.Calendar;

public class Compteur extends AppCompatActivity {
    private Button bt1;
    private TextView compteurPompes;
    private TextView compteurPompesTotal;
    private int semaineActuelle;
    private int anneeActuelle;
    private String nombrePompes;
    private int compteurTotal=200;
    private Calendar calendrier;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compteur);
        bt1 = (Button) findViewById(R.id.compteur_bt1);
        compteurPompes=(TextView)findViewById(R.id.compteurNbPompes);
        compteurPompesTotal=(TextView)findViewById(R.id.compteurNbPompesTotal);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameActivity = new Intent(Compteur.this, MainActivity.class);
                startActivity(gameActivity);
            }
        });
        nombrePompes="";
        calendrier=Calendar.getInstance();
        semaineActuelle = calendrier.get(Calendar.WEEK_OF_YEAR);
        anneeActuelle = calendrier.get(Calendar.YEAR);
        if(anneeActuelle>2021){
            semaineActuelle+=(anneeActuelle-2021)*52;
        }
        semaineActuelle+=16;
        nombrePompes+=semaineActuelle;
        compteurPompes.setText(nombrePompes);
        for(int i=20;i<semaineActuelle;i++){
            compteurTotal+=6*i;
        }
        compteurTotal+=31*(calendrier.get(Calendar.DAY_OF_WEEK)-1);
        nombrePompes=""+compteurTotal;
        compteurPompesTotal.setText(nombrePompes);
    }


}