package br.uniacademia.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class JurosSimples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juros_simples);

        Button calcJSimples = (Button) findViewById(R.id.btCalcularJS);
        calcJSimples.setOnClickListener(CalculoJS);
    }


    private View.OnClickListener CalculoJS = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            EditText capitalJS = (EditText) findViewById(R.id.capitalJS);
            EditText taxaJS = (EditText) findViewById(R.id.taxaJS);
            EditText periodoJS = (EditText) findViewById(R.id.periodoJS);
            TextView txtSaidaJS = (TextView) findViewById(R.id.txtSaidaJS);

            Double capital = Double.parseDouble(String.valueOf(capitalJS.getText().toString()));
            Double taxa = Double.parseDouble(String.valueOf(taxaJS.getText().toString()));
            Double periodo = Double.parseDouble(String.valueOf(periodoJS.getText().toString()));


            if(capital == null || taxa == null || periodo == null){
                txtSaidaJS.setText("Preencha todos os valores.");
            }else if(capital == 0 || taxa == 0 || periodo == 0){
                txtSaidaJS.setText("Preencha com valores diferentes de zero.");
            }else{
                Double result = capital*(taxa/100)*periodo;
                txtSaidaJS.setText(result.toString());
            }
        }
    };
}
