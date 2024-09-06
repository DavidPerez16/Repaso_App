package com.example.practicolog;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class SesionIniciada extends AppCompatActivity {
    ImageView imgH;
    TextView txt_nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sesion_iniciada);

        txt_nombre= findViewById(R.id.txt_nombre);

        Intent i = getIntent();
        String nombreU= i.getStringExtra("nombre");
        txt_nombre.setText("Eress la monda "+ nombreU);




    }
}