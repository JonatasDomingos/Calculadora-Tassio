package com.example.calculeaqui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalculoJurosComposto extends AppCompatActivity {

    private static int splashTime = 6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_juros_composto);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String txtCod = bundle.getString("cod");
        TextView txtResultado = (TextView) findViewById(R.id.infoAplicação);
        txtResultado.setText(txtCod+" R$");


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(CalculoJurosComposto.this, Principal1.class);
                startActivity(homeIntent);
                finish();
            }
        }, splashTime);





    }



}
