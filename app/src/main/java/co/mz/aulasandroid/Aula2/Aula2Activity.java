package co.mz.aulasandroid.Aula2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import co.mz.aulasandroid.Aula3.SpinnerActivity;
import co.mz.aulasandroid.Exercicio1.Exercicio1Activity;
import co.mz.aulasandroid.R;
import co.mz.aulasandroid.UltimaAula.DetalhesActivity;

public class Aula2Activity extends AppCompatActivity {

    EditText etNome, etApelido;
    Button bMostrar, btActivity , bExercicio;

    String nome, apelido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        etNome = (EditText) findViewById(R.id.etNome);
        etApelido = (EditText) findViewById(R.id.etApelido);
        bMostrar = (Button) findViewById(R.id.btShow);
        btActivity = (Button) findViewById(R.id.btSpinner);
        bExercicio = (Button) findViewById(R.id.btExercicio);

        bMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nome = etNome.getText().toString();
                apelido = etApelido.getText().toString();

                Intent i = new Intent(Aula2Activity.this, DetalhesActivity.class);
                i.putExtra("nome" ,nome);
                i.putExtra("apelido" ,apelido);
                startActivity(i);
            }
        });

        btActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Aula2Activity.this, SpinnerActivity.class);
                startActivity(i);
            }
        });

        bExercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Aula2Activity.this, Exercicio1Activity.class);
                startActivity(i);
            }
        });
    }

}
