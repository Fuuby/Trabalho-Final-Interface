package br.uniacademia.trabalho;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button jurosSimples = (Button) findViewById(R.id.btJurosSimples);
        jurosSimples.setOnClickListener(pagJSimples);

        Button jurosComposto = (Button) findViewById(R.id.btJurosComposto);
        jurosComposto.setOnClickListener(pagJComposto);

        Button jurosDesconto = (Button) findViewById(R.id.btDesconto);
        jurosDesconto.setOnClickListener(pagDesconto);
    }

    private View.OnClickListener pagJSimples = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent next = new Intent(MainActivity.this, JurosSimples.class);

            startActivity(next);

        }
    };
    private View.OnClickListener pagJComposto = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent next = new Intent(MainActivity.this, JurosComposto.class);

            startActivity(next);

        }
    };
    private View.OnClickListener pagDesconto = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent next = new Intent(MainActivity.this, Desconto.class);

            startActivity(next);

        }
    };


}
