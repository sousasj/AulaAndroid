package co.mz.aulasandroid.Exercicio1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import co.mz.aulasandroid.R;

public class Exercicio1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText etPrimeiro = (EditText) findViewById(R.id.number1);
        final EditText etSegundo = (EditText) findViewById(R.id.number1);

        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);
        Button mult = (Button) findViewById(R.id.mult);
        Button div = (Button) findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double primeiro = 0, segundo = 0, total = 0;

                primeiro = Double.parseDouble(etPrimeiro.getText().toString());
                segundo = Double.parseDouble(etSegundo.getText().toString());

                total = primeiro +  segundo;

                Toast.makeText(Exercicio1Activity.this, total+"", Toast.LENGTH_SHORT).show();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double primeiro = 0, segundo = 0, total = 0;

                primeiro = Double.parseDouble(etPrimeiro.getText().toString());
                segundo = Double.parseDouble(etSegundo.getText().toString());

                total = primeiro -  segundo;

                Toast.makeText(Exercicio1Activity.this, total+"", Toast.LENGTH_SHORT).show();
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double primeiro = 0, segundo = 0, total = 0;

                primeiro = Double.parseDouble(etPrimeiro.getText().toString());
                segundo = Double.parseDouble(etSegundo.getText().toString());

                total = primeiro *  segundo;

                Toast.makeText(Exercicio1Activity.this, total+"", Toast.LENGTH_SHORT).show();
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double primeiro = 0, segundo = 0, total = 0;

                primeiro = Double.parseDouble(etPrimeiro.getText().toString());
                segundo = Double.parseDouble(etSegundo.getText().toString());

                total = primeiro /  segundo;

                Toast.makeText(Exercicio1Activity.this, total+"", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
