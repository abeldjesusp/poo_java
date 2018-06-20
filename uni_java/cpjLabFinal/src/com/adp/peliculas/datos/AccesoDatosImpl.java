package com.adp.peliculas.datos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.adp.peliculas.domain.Pelicula;
import com.adp.peliculas.excepciones.*;

public class AccesoDatosImpl implements iAccesoDatos{

    @Override
    public boolean exite(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList();
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea;
            linea = entrada.readLine();
            while(linea != null){
                Pelicula objPelicula = new Pelicula(linea);
                peliculas.add(objPelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito correctamente");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
         File archivo = new File(nombreArchivo);
         String resultado = null;
         try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea;
            int i = 0;
            
            linea = entrada.readLine();            
            while(linea != null){
                if(buscar != null && buscar.equalsIgnoreCase(linea)){
                    resultado = "Pelicula " + linea + " encontrada en indice " + i;
                    break;
                }
                linea = entrada.readLine();
                i++;
            }
            entrada.close();
         }catch(IOException ioe){
             ioe.printStackTrace();
         }
         
         return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
       File archivo = new File(nombreArchivo);
       try{
           PrintWriter salida = new PrintWriter(new FileWriter(archivo));
           salida.close();
           System.out.println("El archivo se ha creado correctamente");
       }catch(IOException ioe){
           ioe.printStackTrace();
       }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        archivo.delete();
        System.out.println("El archivo se ha borrado correctamente");
    }
    
}
