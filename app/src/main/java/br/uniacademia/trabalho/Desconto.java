package br.uniacademia.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Desconto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desconto);

        Button calcDesconto = (Button) findViewById(R.id.btCalcularD);
        calcDesconto.setOnClickListener(CalculoD);
    }

    private View.OnClickListener CalculoD = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            EditText ValorNominalD = (EditText) findViewById(R.id.ValorNominalD);
            EditText taxaD = (EditText) findViewById(R.id.taxaD);
            EditText periodoD = (EditText) findViewById(R.id.periodoD);
            TextView txtSaidaD = (TextView) findViewById(R.id.txtSaidaD);

            Double capital = Double.parseDouble(String.valueOf(ValorNominalD.getText().toString()));
            Double taxa = Double.parseDouble(String.valueOf(taxaD.getText().toString()));
            Double periodo = Double.parseDouble(String.valueOf(periodoD.getText().toString()));


            if(capital == null || taxa == null || periodo == null){
                txtSaidaD.setText("Preencha todos os valores.");
            }else if(capital == 0 || taxa == 0 || periodo == 0){
                txtSaidaD.setText("Preencha com valores diferentes de zero.");
            }else{
                Double result = capital*(taxa/100)*periodo;
                txtSaidaD.setText(result.toString());
            }
        }
    };
}
