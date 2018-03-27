package co.mz.aulasandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import co.mz.aulasandroid.Adapter.DashboardAdapter;
import co.mz.aulasandroid.Aula1.MainActivity;
import co.mz.aulasandroid.Aula2.Aula2Activity;
import co.mz.aulasandroid.Aula3.SpinnerActivity;
import co.mz.aulasandroid.Exercicio1.Exercicio1Activity;
import co.mz.aulasandroid.Model.Generic;

public class DashboardActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private DashboardAdapter adapter;
    private List<Generic> albumList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_call_log);

        albumList = new ArrayList<>();

        adapter = new DashboardAdapter(this, albumList, new DashboardAdapter.mClickListener() {
            @Override
            public void mClick(View v, int position) {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(DashboardActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(DashboardActivity.this, Aula2Activity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(DashboardActivity.this, SpinnerActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(DashboardActivity.this, Exercicio1Activity.class);
                        startActivity(intent);
                        break;

                    default: break;
                }

            }
        });

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 3);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(adapter);

        loadItems();
    }

    private void loadItems() {

        Generic a = new Generic("Aula 1");
        albumList.add(a);
        a = new Generic("Aula 2");
        albumList.add(a);
        a = new Generic("Aula 3");
        albumList.add(a);
        a = new Generic("Exercicio 1");
        albumList.add(a);

        adapter.notifyDataSetChanged();
    }
}
