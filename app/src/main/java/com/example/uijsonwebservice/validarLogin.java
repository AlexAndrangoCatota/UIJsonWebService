package com.example.uijsonwebservice;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.uijsonwebservice.WebService.Asynchtask;
import com.example.uijsonwebservice.WebService.WebService;

import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;

//public class validarLogin extends AppCompatActivity implements Asynchtask {
    public class validarLogin extends AppCompatActivity {
    TextView lblMensaje;
    RequestQueue requestQueue;
    private static final String URL = "https://gorest.co.in/public/v1/users?page=1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validar_login);


        requestQueue = Volley.newRequestQueue(this);

        initUI();
        stringRequest();
//        Bundle bundle = this.getIntent().getExtras();
//
//        Map<String, String> datos = new HashMap<String, String>();
//        WebService ws= new
//                //WebService("http://uealecpeterson.net/ws/login.php?usr="
//                WebService("https://gorest.co.in/public/v1/users?page=1"
//                + bundle.getString("usuario") + "&pass=" + bundle.getString("pass"),
//                datos, validarLogin.this, validarLogin.this);
//        ws.execute("GET");
//
//    }
//
//    @Override
//    public void processFinish(String result) throws JSONException {
//        TextView txtSaludo = (TextView)findViewById(R.id.lblMensaje);
//        //txtSaludo.setText("Hola!, Bienvenido \n " + bundle.getString("usuario")+"\n contraseña \n "+bundle.getString("pass"));
//        txtSaludo.setText("Respuesta del Web Service"+result);
//
//    }


    }
    private void initUI() { lblMensaje = findViewById(R.id.lblMensaje);
    }
    private void stringRequest(){
        StringRequest request = new StringRequest(
                Request.Method.GET,
                URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        lblMensaje.setText(response);

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );
        requestQueue.add(request);
    }

}