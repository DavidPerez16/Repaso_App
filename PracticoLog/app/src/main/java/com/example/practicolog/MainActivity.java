package com.example.practicolog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edt_usuario, edt_contraseña;
    Button btn_iniciar;
    String usuarioDado = "hander";
    String contraseñaDada = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edt_usuario = findViewById(R.id.edt_usuario);
        edt_contraseña = findViewById(R.id.edt_contraseña);
        btn_iniciar = findViewById(R.id.btn_iniciar);

        btn_iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String usuarioIngresado = edt_usuario.getText().toString();
                String contraseñaIngresada = edt_contraseña.getText().toString();

                if ((usuarioIngresado.equals(usuarioDado)) && (contraseñaIngresada.equals(contraseñaDada))){
                    Intent i = new Intent(MainActivity.this, SesionIniciada.class);
                    i.putExtra("nombre",usuarioIngresado);
                    startActivity(i);



                } else {
                    Toast.makeText(MainActivity.this,"Usuario o contraseña invalidos",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}