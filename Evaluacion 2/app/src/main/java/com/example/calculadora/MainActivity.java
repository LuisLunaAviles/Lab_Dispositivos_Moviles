package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button BtnUno, BtnDos, BtnTres, BtnCuatro, BtnCinco, BtnSeis, BtnSiete, BtnOcho, BtnNueve, BtnCero;
    Button BtnSuma, BtnResta, BtnMulti, BtnDivi, BtnIgual, BtnACE, BtnDEL, BtnPunto, BtnAb, BtnCrd;
    TextView Resultado;
    double resultado;
    String operador, mostrar, reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnUno = (Button)findViewById(R.id.Btn1);
        BtnDos = (Button)findViewById(R.id.Btn2);
        BtnTres = (Button)findViewById(R.id.Btn3);
        BtnCuatro = (Button)findViewById(R.id.Btn4);
        BtnCinco = (Button)findViewById(R.id.Btn5);
        BtnSeis = (Button)findViewById(R.id.Btn6);
        BtnSiete = (Button)findViewById(R.id.Btn7);
        BtnOcho = (Button)findViewById(R.id.Btn8);
        BtnNueve = (Button)findViewById(R.id.Btn9);
        BtnCero = (Button)findViewById(R.id.Btn0);

        BtnSuma = (Button)findViewById(R.id.BtnMas);
        BtnResta = (Button)findViewById(R.id.BtnMenos);
        BtnMulti = (Button)findViewById(R.id.BtnMultiplicacion);
        BtnDivi = (Button)findViewById(R.id.BtnDivision);
        BtnIgual = (Button)findViewById(R.id.BtnIgual);
        BtnACE = (Button)findViewById(R.id.BtnAce);
        BtnDEL = (Button)findViewById(R.id.BtnDel);
        BtnPunto = (Button)findViewById(R.id.BtnPunto);
        BtnAb = (Button)findViewById(R.id.BtnAbierto);
        BtnCrd = (Button)findViewById(R.id.BtnCerrado);

        Resultado = (TextView)findViewById(R.id.txVDisplay);

        BtnUno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                Resultado.setText(mostrar);
            }
        });

        BtnDos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "2";
                Resultado.setText(mostrar);
            }
        });

        BtnTres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "3";
                Resultado.setText(mostrar);
            }
        });

        BtnCuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "4";
                Resultado.setText(mostrar);
            }
        });

        BtnCinco.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "5";
                Resultado.setText(mostrar);
            }
        });

        BtnSeis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "6";
                Resultado.setText(mostrar);
            }
        });

        BtnSiete.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "7";
                Resultado.setText(mostrar);
            }
        });

        BtnOcho.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "8";
                Resultado.setText(mostrar);
            }
        });

        BtnNueve.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "9";
                Resultado.setText(mostrar);
            }
        });

        BtnSuma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "+";
                Resultado.setText("");
            }
        });

        BtnResta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "-";
                Resultado.setText("");
            }
        });

        BtnMulti.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "*";
                Resultado.setText("");
            }
        });

        BtnDivi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "/";
                Resultado.setText("");
            }
        });

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            //Se cumple que sea Landscape entonces llamo a mis controles
            BtnPunto.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    mostrar = Resultado.getText().toString();
                    mostrar = mostrar + ".";
                    Resultado.setText(mostrar);
                }
            });

            BtnAb.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    mostrar = Resultado.getText().toString();
                    mostrar = mostrar + "(";
                    Resultado.setText(mostrar);
                }
            });

            BtnCrd.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    mostrar = Resultado.getText().toString();
                    mostrar = mostrar + ")";
                    Resultado.setText(mostrar);
                }
            });
        }

        BtnACE.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = "";
                Resultado.setText(mostrar);
                reserva = "";
                operador = "";
            }
        });

        BtnDEL.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar.substring(0,mostrar.length()-1);
                Resultado.setText(mostrar);
            }
        });

        BtnIgual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                if(operador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
            }
        });

    }
}