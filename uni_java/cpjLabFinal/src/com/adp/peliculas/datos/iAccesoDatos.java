package com.adp.peliculas.datos;

import com.adp.peliculas.domain.Pelicula;
import java.util.List;
import com.adp.peliculas.excepciones.*;

public interface iAccesoDatos {    
    public boolean exite(String nombreArchivo) throws AccesoDatosEx;
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
    public void crear(String nombreArchivo) throws AccesoDatosEx;
    public void borrar(String nombreArchivo) throws AccesoDatosEx;
}
