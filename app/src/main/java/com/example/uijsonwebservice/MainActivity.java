package com.example.uijsonwebservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        initUI();
        button.setOnClickListener((view) ->  {
                startActivity(new Intent(MainActivity.this, validarLogin.class));
        });

    }
    private void initUI(){
        button = findViewById(R.id.button);
    }


//    public void btEnviar(View view){
//        //Creamos el Intent
//        Intent intent = new Intent(MainActivity.this, validarLogin.class);
//        EditText txtUsuario = (EditText)findViewById(R.id.txtUsuario);
//        EditText txtPass = (EditText)findViewById(R.id.txtPass);
//        // Creamos la información a pasar entre actividades - Pares Key-Value
//        Bundle b = new Bundle();
//        b.putString("usuario", txtUsuario.getText().toString());
//        b.putString("pass", txtPass.getText().toString());
//        // Añadimos la información al intent
//        intent.putExtras(b);
//        // Iniciamos la nueva actividad
//        startActivity(intent);
//    }


    }