package co.mz.aulasandroid.UltimaAula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import co.mz.aulasandroid.R;

public class DetalhesActivity extends AppCompatActivity {

    TextView txtNome, txtApelido;

    String nome, apelido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        txtNome = (TextView) findViewById(R.id.txtNome);
        txtApelido = (TextView) findViewById(R.id.txtApelido);

        Intent i = getIntent();
        nome = i.getStringExtra("nome");
        apelido = i.getStringExtra("apelido");

        txtNome.setText(nome);
        txtApelido.setText(apelido);
    }
}
