package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputPrimeiroValor;
    EditText inputSegundoValor;
    Button somar;
    Button subtrair;
    Button dividir;
    Button multiplicar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //------------------------------------------------------------------------------------------
        inputPrimeiroValor = findViewById(R.id.inputPrimeiroValor);
        inputSegundoValor = findViewById(R.id.inputSegundoValor);
        somar = findViewById(R.id.somar);
        subtrair = findViewById(R.id.subtrair);
        dividir = findViewById(R.id.dividir);
        multiplicar = findViewById(R.id.multiplicar);


        somar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(inputPrimeiroValor.getText().toString().isEmpty() || inputSegundoValor.getText().toString().isEmpty()){
                    if(inputPrimeiroValor.getText().toString().isEmpty()){
                        Toast.makeText(MainActivity.this
                                , "Preencha o primeiro campo"
                                , Toast.LENGTH_LONG).show();
                    }
                }else if(inputSegundoValor.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this
                            , "Preencha o segundo campo"
                            , Toast.LENGTH_LONG).show();
                }else {
                    double n1 = Double.parseDouble(inputPrimeiroValor.getText().toString());
                    double n2 = Double.parseDouble(inputSegundoValor.getText().toString());
                    double resultado = n1 + n2;
                    String retorno = "";
                    Toast.makeText(MainActivity.this
                            , retorno + "(" + resultado + ")"
                            , Toast.LENGTH_LONG).show();
                }

            }
        });
        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputPrimeiroValor.getText().toString().isEmpty() || inputSegundoValor.getText().toString().isEmpty()){
                    if(inputPrimeiroValor.getText().toString().isEmpty()){
                        Toast.makeText(MainActivity.this
                                , "Preencha o primeiro campo"
                                , Toast.LENGTH_LONG).show();
                    }
                }else if(inputSegundoValor.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this
                            , "Preencha o segundo campo"
                            , Toast.LENGTH_LONG).show();
                }else {
                    double n1 = Double.parseDouble(inputPrimeiroValor.getText().toString());
                    double n2 = Double.parseDouble(inputSegundoValor.getText().toString());
                    double resultado = n1  - n2;
                    String retorno = "";
                    Toast.makeText(MainActivity.this
                            , retorno + "(" + resultado + ")"
                            , Toast.LENGTH_LONG).show();
                }

            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputPrimeiroValor.getText().toString().isEmpty() || inputSegundoValor.getText().toString().isEmpty()){
                   if(inputPrimeiroValor.getText().toString().isEmpty()){
                           Toast.makeText(MainActivity.this
                                   , "Preencha o primeiro campo"
                                   , Toast.LENGTH_LONG).show();
                       }
                   }else if(inputSegundoValor.getText().toString().isEmpty())  {
                        Toast.makeText(MainActivity.this
                                , "Preencha o segundo campo"
                                       , Toast.LENGTH_LONG).show();
                    }else {
                    double n1 = Double.parseDouble(inputPrimeiroValor.getText().toString());
                    double n2 = Double.parseDouble(inputSegundoValor.getText().toString());
                    double resultado = n1 / n2;
                    String retorno = "";
                    Toast.makeText(MainActivity.this
                            , retorno + "(" + resultado + ")"
                            , Toast.LENGTH_LONG).show();
                }

            }
        });
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputPrimeiroValor.getText().toString().isEmpty() || inputSegundoValor.getText().toString().isEmpty()){
                    if(inputPrimeiroValor.getText().toString().isEmpty()){
                        Toast.makeText(MainActivity.this
                                , "Preencha o primeiro campo"
                                , Toast.LENGTH_LONG).show();
                    }
                }else if(inputSegundoValor.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this
                            , "Preencha o segundo campo"
                            , Toast.LENGTH_LONG).show();
                }else {
                    double n1 = Double.parseDouble(inputPrimeiroValor.getText().toString());
                    double n2 = Double.parseDouble(inputSegundoValor.getText().toString());
                    double resultado = n1 * n2;
                    String retorno = "";
                    Toast.makeText(MainActivity.this
                            , retorno + "(" + resultado + ")"
                            , Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
