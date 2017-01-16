package com.example.silvanadorantes.postresfitness;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
   public static final String ID_DESSERTFIT = "com.example.silvanadorantes.postresfitness.idDessertFit";
    private ArrayList<DessertFit> mDessert;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Se obtiene la posición del item seleccionado
        int position = getIntent().getIntExtra(ID_DESSERTFIT, -1);
        TextView nombre_detail = (TextView) findViewById(R.id.nombre_detail);
        TextView descripcion_detail = (TextView) findViewById(R.id.descripcion_detail);
        TextView ingredientes_detail = (TextView)findViewById(R.id.ingredientes_detail);
        TextView preparacion_detail = (TextView) findViewById(R.id.preparacion_detail);
        ImageView imageView = (ImageView) findViewById(R.id.image_parallax);

        DessertFit mDessertFit = DessertFitness.getDessertFitByPosition(position);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingtoolbarlayout);
        collapsingToolbarLayout.setTitle(mDessertFit.getNombre());

        //carga la imagenusando la libreria Glide
        Glide.with(this)
                .load(mDessertFit.getImagen())
                .centerCrop()
                .into(imageView);

        nombre_detail.setText(mDessertFit.getNombre());
        descripcion_detail.setText(mDessertFit.getDescripcion());
        ingredientes_detail.setText(mDessertFit.getIngredientes());
        preparacion_detail.setText(mDessertFit.getPreparacion());


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Comprar el Postre Fitness Favorito", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detail, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id){
            case R.id.action_settings:

                        Snackbar.make(findViewById(R.id.coordinator_detail), "se abren los ajustes", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();



                return true;

            case R.id.action_add:

                        Snackbar.make(findViewById(R.id.coordinator_detail), "Añadir a tus Postres Fitness", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();


                return true;

            case R.id.action_favorite:

                        Snackbar.make(findViewById(R.id.coordinator_detail), "Añadir a tus  Postres Fitness Favoritos", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();


                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


}
