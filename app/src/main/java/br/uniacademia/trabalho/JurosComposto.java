package br.uniacademia.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JurosComposto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juros_composto);

        Button calcJComporsto = (Button) findViewById(R.id.btCalcularJC);
        calcJComporsto.setOnClickListener(CalculoJC);
    }

    private final View.OnClickListener CalculoJC = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            EditText capitalJC = (EditText) findViewById(R.id.capitalJC);
            EditText taxaJC = (EditText) findViewById(R.id.taxaJC);
            EditText periodoJC = (EditText) findViewById(R.id.periodoJC);
            TextView txtSaidaJC = (TextView) findViewById(R.id.txtSaidaJC);

            Double capital = Double.parseDouble(String.valueOf(capitalJC.getText().toString()));
            Double taxa = Double.parseDouble(String.valueOf(taxaJC.getText().toString()));
            Double periodo = Double.parseDouble(String.valueOf(periodoJC.getText().toString()));



            if(capital == null || taxa == null || periodo == null){
                txtSaidaJC.setText("Preencha todos os valores.");
            }else if(capital == 0 || taxa == 0 || periodo == 0){
                txtSaidaJC.setText("Preencha com valores diferentes de zero.");
            }else{
                Double result = capital * ( Math.pow( (1+( taxa/100 )), periodo ) );
                txtSaidaJC.setText(result.toString());
            }

        }
    };
}
