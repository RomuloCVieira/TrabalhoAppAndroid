package com.example.siteapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {
    EditText buscar;
    Button button;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buscar  = findViewById(R.id.buscar);
        button  = findViewById(R.id.button);
        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://g1.globo.com/");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buscar.getText().toString().isEmpty()){
                    mostrarMensagem("Digite o que deseja buscar");
                    return;
                }
                webView.loadUrl("https://www.google.com.br/search?q="+   codificarUrl(buscar.getText().toString()));

            }
        });
    }
    private String codificarUrl(String parametro) {
        try {
            return URLEncoder.encode(parametro, "utf-8");
        } catch (Exception e) {
            return "";
        }
    }
    private void mostrarMensagem(final String texto){
        AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
        alerta.setTitle("Aula 05");
        alerta.setMessage(texto);
        alerta.setNeutralButton("OK",null);
        alerta.setNegativeButton("Não", null);
        alerta.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                mostrarMensagem(texto);
            }
        });
        alerta.show();
    }

}
