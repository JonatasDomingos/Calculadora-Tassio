package com.example.calculeaqui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal1);

        Button Desconto = (Button) findViewById(R.id.Desconto);
        Desconto.setOnClickListener(clickdesconto);

        Button JurosSimples = (Button) findViewById(R.id.JSimples);
        JurosSimples.setOnClickListener(clickJurosSimples);

        Button JurosComposto = (Button) findViewById(R.id.JComposto);
        JurosComposto.setOnClickListener(clickJurosComposto);

    }

    private View.OnClickListener clickJurosSimples = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent jurosSImplesIntent = new Intent(Principal1.this, JurosSimples.class);
            startActivity(jurosSImplesIntent);
            finish();
        }
    };

    private View.OnClickListener clickJurosComposto = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent jurosCompostoIntent = new Intent(Principal1.this, JurosComposto.class);
            startActivity(jurosCompostoIntent);
            finish();
        }
    };


    private View.OnClickListener clickdesconto = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent descontoIntent = new Intent(Principal1.this, Desconto.class);
            startActivity(descontoIntent);
            finish();
        }
    };

}
