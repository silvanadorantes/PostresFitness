package com.example.silvanadorantes.postresfitness;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silvana on 16/03/16.
 */
public class DessertFitAdapter extends RecyclerView.Adapter<DessertFitAdapter.ViewHolder>{
    private LayoutInflater mLayoutInflater;
    private List<DessertFit> mDessertFit;
    private Context mContext;
    private OnItemClickListener listener;

    public interface OnItemClickListener{
        public void onClick(DessertFitAdapter.ViewHolder viewHolder, int idDessertFit);
    }


    public DessertFitAdapter(Context context,  List<DessertFit> dessertFits, OnItemClickListener listener){
        mContext = context;
        mLayoutInflater = mLayoutInflater.from(context);
        mDessertFit = dessertFits;
        this.listener = listener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mNombre;
        private ImageView mImagen;

        public ViewHolder(View dessertfitView){
            super(dessertfitView);
            mNombre = (TextView) dessertfitView.findViewById(R.id.list_item_textView);
            mImagen = (ImageView) dessertfitView.findViewById(R.id.avatar);
            dessertfitView.setOnClickListener(this);
            mNombre.setOnClickListener(this);
            mImagen.setOnClickListener(this);


        }

        public void setNombre(String text) {
            mNombre.setText(text);
        }

        public void setImagen(int image) {
            mImagen.setTag(image);
            mImagen.setImageResource(image);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(this,  getIdDessertFit(getAdapterPosition()));
        }

    }

    private int getIdDessertFit(int position){
        if (position != RecyclerView.NO_POSITION){
            return mDessertFit.get(position).getId();
        } else {
            return -1;
        }
    }


    @Override
    public int getItemCount() {

        return DessertFitness.getDessertFitness().size();
    }

    public void add(DessertFit dessertFit){
        mDessertFit.add(dessertFit);
        notifyItemInserted(mDessertFit.indexOf(dessertFit));
    }

    public void remove(DessertFit dessertFit){
        int position = mDessertFit.indexOf(dessertFit);
        if (position != -1){
            mDessertFit.remove(position);
            notifyItemInserted(position);
        }
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View mdessertfitView;

        mdessertfitView = mLayoutInflater.inflate(R.layout.list_dessert_item, viewGroup, false);

        return new ViewHolder(mdessertfitView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        DessertFit dessertFit = mDessertFit.get(i);
        viewHolder.mNombre.setText(dessertFit.getNombre());
        Glide.with(viewHolder.mImagen.getContext())
                .load(dessertFit.getImagen())
                .centerCrop()
                .into(viewHolder.mImagen);


    }



}


