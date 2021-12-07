package com.example.uijsonwebservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.uijsonwebservice.WebService.Asynchtask;
import com.example.uijsonwebservice.WebService.WebService;

import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;

public class validarLogin extends AppCompatActivity implements Asynchtask {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validar_login);

        Bundle bundle = this.getIntent().getExtras();

        Map<String, String> datos = new HashMap<String, String>();
        WebService ws= new
                //WebService("http://uealecpeterson.net/ws/login.php?usr="
                WebService("https://gorest.co.in/public/v1/users?page=1"
                + bundle.getString("usuario") + "&pass=" + bundle.getString("pass"),
                datos, validarLogin.this, validarLogin.this);
        ws.execute("GET");

    }

    @Override
    public void processFinish(String result) throws JSONException {
        TextView txtSaludo = (TextView)findViewById(R.id.lblMensaje);
        //txtSaludo.setText("Hola!, Bienvenido \n " + bundle.getString("usuario")+"\n contraseña \n "+bundle.getString("pass"));
        txtSaludo.setText("Respuesta del Web Service"+result);

    }
}