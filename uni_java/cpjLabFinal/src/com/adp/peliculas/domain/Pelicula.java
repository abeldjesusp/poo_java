package com.adp.peliculas.domain;

public class Pelicula {
    private String nombre;
    
    public Pelicula(){
    }
    
    public Pelicula(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){ return nombre; }
    public void setNombre(String nombre){ this.nombre = nombre; }
    
    public @Override String toString(){
        return nombre;
    }
}
