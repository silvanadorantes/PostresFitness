package com.example.silvanadorantes.postresfitness;

import java.util.Arrays;
import java.util.List;

/**
 * Created by silvana on 16/03/16.
 */
public class DessertFit {
    private int id;
    private String nombre;
    private String descripcion;
    private String ingredientes;
    private String preparacion;
    private int imagen;

    public DessertFit(int id, String nombre, String descripcion, String ingredientes, String preparacion,
                      int imagen){

        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }



}
