package com.example.calculeaqui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class JurosComposto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juros_composto);

        Button BtVoltar = (Button) findViewById(R.id.btBack);
        BtVoltar.setOnClickListener(clickvoltar1);

        Button Calcular = (Button) findViewById(R.id.btCalculator);
        Calcular.setOnClickListener(clickcalcular3);
    }

    private View.OnClickListener clickvoltar1 = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent CompostoIntent = new Intent(JurosComposto.this, Principal1.class);
            startActivity(CompostoIntent);
            finish();
        }
    };

    private View.OnClickListener clickcalcular3 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            EditText valorProduto = (EditText) findViewById(R.id.IdCapital);
            String textValorProduto = valorProduto.getText().toString();
            double produto = Double.parseDouble(textValorProduto);


            EditText valorTaxa = (EditText) findViewById(R.id.idTaxa);
            String textTaxa = valorTaxa.getText().toString();
            double taxa = Double.parseDouble(textTaxa);

            EditText tempo = (EditText) findViewById(R.id.IdTempo);
            String textTempo = tempo.getText().toString();
            double time = Double.parseDouble(textTempo);


            if (!textValorProduto.matches("") && !textTaxa.matches("") && !textTempo.matches("")){
                double calculo = (produto*Math.pow(1+0.01*taxa,time));
                DecimalFormat df = new DecimalFormat("#,###.00");



                Intent Intent = new Intent(JurosComposto.this, CalculoJurosComposto.class);
                String txtCod = String.valueOf(df.format(calculo));
                if (!txtCod.matches("")) {
                    Bundle bundle = new Bundle();
                    bundle.putString("cod", txtCod.toUpperCase());
                    Intent.putExtras(bundle);
                    startActivity(Intent);
                    finish();
                }else{


                }

            }






        }





    };
}

