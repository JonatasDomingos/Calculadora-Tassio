package com.example.calculeaqui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class CalculoJurosSimples extends AppCompatActivity {

    private static int splashTime = 6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_juros_simples);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String txtCod = bundle.getString("cod");
        TextView txtResultado = (TextView) findViewById(R.id.InfoTotal);
        txtResultado.setText(txtCod+" R$");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(CalculoJurosSimples.this, Principal1.class);
                startActivity(homeIntent);
                finish();
            }
        }, splashTime);





    }

}
