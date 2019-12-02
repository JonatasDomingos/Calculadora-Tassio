package com.example.calculeaqui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Desconto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desconto);

        Button BtVoltar = (Button) findViewById(R.id.BtVoltar);
        BtVoltar.setOnClickListener(clickReturn);
        Button Calcular = (Button) findViewById(R.id.BtCalcular);
        Calcular.setOnClickListener(clickcalcular);
    }

    private View.OnClickListener clickReturn = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent mainIntent = new Intent(Desconto.this, Principal1.class);
            startActivity(mainIntent);
            finish();
        }
    };

    private View.OnClickListener clickcalcular = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            EditText valorProduto = (EditText) findViewById(R.id.InputValorProduto);
            String textValorProduto = valorProduto.getText().toString();
            double produto = Double.parseDouble(textValorProduto);


            EditText valorTaxa = (EditText) findViewById(R.id.InputValorTaxa);
            String textTaxa = valorTaxa.getText().toString();
            double taxa = Double.parseDouble(textTaxa);

            EditText tempo = (EditText) findViewById(R.id.InputValorTempo);
            String textTempo = tempo.getText().toString();
            double time = Double.parseDouble(textTempo);


            if (!textValorProduto.matches("") && !textTaxa.matches("") && !textTempo.matches("")){
                double calculo = (produto*time*(0.01*taxa));

                Intent Intent = new Intent(Desconto.this, CalculoDesconto.class);
                String txtCod = String.valueOf(calculo);
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
