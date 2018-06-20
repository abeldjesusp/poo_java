package com.adp.peliculas.negocio;

import com.adp.peliculas.domain.Pelicula;

public interface iCatalogoPeliculas {
    public void agregarPeliculas(String nombrePelicula, String nombreArchivo);
    public void listarPeliculas(String nombreArchivo);
    public void buscarPelicula(String nombreArchivo, String buscar);
    public void iniciarPelicula(String nombreArchivo);
}
