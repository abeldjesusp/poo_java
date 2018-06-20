package com.adp.peliculas.excepciones;

public class AccesoDatosEx extends Exception {
    private String mensaje;
    
    public AccesoDatosEx(String mensaje){
        this.mensaje = mensaje;
    }
}
