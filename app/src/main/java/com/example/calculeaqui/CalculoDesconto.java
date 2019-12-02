package com.example.calculeaqui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class CalculoDesconto extends AppCompatActivity {

    private static int splashTime = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_desconto);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String txtCod = bundle.getString("cod");
        TextView txtResultado = (TextView) findViewById(R.id.InfoDesconto);
        txtResultado.setText(txtCod+" R$");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(CalculoDesconto.this, Principal1.class);
                startActivity(homeIntent);
                finish();
            }
        }, splashTime);





    }
}
