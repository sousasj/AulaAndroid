package co.mz.aulasandroid.Aula3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import co.mz.aulasandroid.R;

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        final Spinner spProvincia = (Spinner) findViewById(R.id.spProvincias);

        List<String> listProvincias = new ArrayList<String>();
        listProvincias.add("Maputo");
        listProvincias.add("Gaza");
        listProvincias.add("Inhambane");
        listProvincias.add("Sofala");
        listProvincias.add("Manica");
        listProvincias.add("Zambezia");
        listProvincias.add("Tete");
        listProvincias.add("Nampula");
        listProvincias.add("Niassa");
        listProvincias.add("Cabo Delgado");

        ArrayAdapter<String> dataAdapterPayments = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listProvincias);
        dataAdapterPayments.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spProvincia.setAdapter(dataAdapterPayments);

        spProvincia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(SpinnerActivity.this, spProvincia.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
