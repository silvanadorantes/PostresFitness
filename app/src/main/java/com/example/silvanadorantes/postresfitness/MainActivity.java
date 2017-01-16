package com.example.silvanadorantes.postresfitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements DessertFitAdapter.OnItemClickListener{

    private RecyclerView mRecyclerView;
    private DessertFitAdapter mAdapter;
    private CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

            init();



    }

    private void init(){
        mRecyclerView =(RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new DessertFitAdapter(this, DessertFitness.getDessertFitness(), this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onClick(DessertFitAdapter.ViewHolder viewHolder, int idDessertFit) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.ID_DESSERTFIT, idDessertFit);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       switch (id){
               case R.id.action_search:
                       Snackbar.make(findViewById(R.id.coordinator_main), "Comenzar a Buscar", Snackbar.LENGTH_LONG)
                               .setAction("Action", null).show();
                       return true;
               case R.id.action_settings:
                       Snackbar.make(findViewById(R.id.coordinator_main), "se aren los ajustes", Snackbar.LENGTH_LONG)
                               .setAction("Action", null).show();
                       return true;

       }

        return super.onOptionsItemSelected(item);
    }
}
