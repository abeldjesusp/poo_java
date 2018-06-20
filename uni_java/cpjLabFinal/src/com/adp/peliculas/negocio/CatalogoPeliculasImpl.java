package com.adp.peliculas.negocio;

import com.adp.peliculas.datos.*;
import com.adp.peliculas.domain.Pelicula;
import com.adp.peliculas.excepciones.*;
import java.util.List;

public class CatalogoPeliculasImpl implements iCatalogoPeliculas{
    private final iAccesoDatos datos;
    
    public CatalogoPeliculasImpl(){
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPeliculas(String nombrePelicula, String nombreArchivo) {
        Pelicula objPelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        
        try{
            anexar = datos.exite(nombreArchivo);
            datos.escribir(objPelicula, nombreArchivo, anexar);
        }catch(AccesoDatosEx ADEx){
            System.out.println("Error de acceso a datos");
            ADEx.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        try{
           List<Pelicula> objPeliculas = datos.listar(nombreArchivo);
           for(Pelicula p : objPeliculas){
               System.out.println("Pelicula : " + p);
           }
        }catch(AccesoDatosEx ADEx){
            System.out.println("Error de acceso a datos");
            ADEx.printStackTrace();
        }        
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        String resultado = null;
        try{
            resultado = datos.buscar(nombreArchivo, buscar);
        }catch(AccesoDatosEx ADEx){
            System.out.println("Error al buscar la pelicula");
            ADEx.printStackTrace();
        }        
        System.out.println("Resultado de la busqueda : " + resultado);
    }

    @Override
    public void iniciarPelicula(String nombreArchivo) {
        try{
            if(datos.exite(nombreArchivo)){
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            }else{
                datos.crear(nombreArchivo);
            }
        }catch(AccesoDatosEx ADEx){
            System.out.println("Error de acceso a datos");
            ADEx.printStackTrace();
        }        
    }
    
}
