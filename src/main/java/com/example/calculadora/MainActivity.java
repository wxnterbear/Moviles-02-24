package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button sum;
    private Button res;
    private Button mult;
    private Button div;
    private Button pot;
    private Button suc;
    private Button fact;
    private TextView mensaje;
    private EditText num1;
    private EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensaje = findViewById(R.id.cajares);
        num1 = findViewById(R.id.dato1);
        num2 = findViewById(R.id.dato2);

        sum = findViewById(R.id.button);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double resultado = funcionSuma(Double.parseDouble(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
                mensaje.setText(String.valueOf(resultado));
            }
        });

        res = findViewById(R.id.button2);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double resultado = funcionResta(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
                mensaje.setText(String.valueOf(resultado));
            }
        });

        mult = findViewById(R.id.button3);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double resultado = funcionMultiplicacion(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
                mensaje.setText(String.valueOf(resultado));
            }
        });

        div = findViewById(R.id.button4);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double resultado = funcionDivision(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
                mensaje.setText(String.valueOf(resultado));
            }
        });

        pot = findViewById(R.id.button5);
        pot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double resultado = funcionPotencia(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
                mensaje.setText(String.valueOf(resultado));
            }
        });


        fact = findViewById(R.id.button7);
        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double resultado = funcionFactorial(Double.parseDouble(num1.getText().toString()));
                mensaje.setText(String.valueOf(resultado));
            }
        });

        suc = findViewById(R.id.button6);
        suc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long resultado = funcionSucesion(Long.parseLong(num1.getText().toString()));
                mensaje.setText(String.valueOf(resultado));
            }
        });


    }

    public double funcionSuma(double valor1, double valor2) {

        return valor1 + valor2;
    }

    public double funcionResta(double valor1, double valor2) {

        return valor1 - valor2;
    }

    public double funcionMultiplicacion(double valor1, double valor2) {

        return valor1 * valor2;
    }

    public double funcionDivision(double valor1, double valor2) {

        if (valor2 != 0) {
            return valor1 / valor2;
        } else {

            return Double.NaN;
        }
    }

    public double funcionPotencia(double valor1, double valor2) {

        double msj;

        if (valor2 == 0) {
            msj = 1;
        } else {
            msj = valor1 * funcionPotencia(valor1, valor2 - 1);
        }
        return msj;


    }

    public double funcionFactorial(double valor1){

        double msj;

        if (valor1 == 0){
            return 1;

        } else {
            msj = valor1 * funcionFactorial(valor1 - 1);

        }
        return msj;

    }

    public long funcionSucesion(double valor1){

        long msj;

        if (valor1 == 0) {
            return 0;

        } else if (valor1 == 1) {
            return 1;

        } else {
            msj = funcionSucesion(valor1 - 1) + funcionSucesion(valor1 - 2);
        }

        return msj;

    }


}