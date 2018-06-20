
package manejoarchivos;

import static utileria.Archivos.*;

public class ManejoArchivos {
    
    private static final String NOMBRE_ARCHIVO = "C:\\Users\\anyi\\Documents\\Abel\\Java\\ManejoArchivos\\src\\prueba.txt";
    
    public static void main(String[] args) {
       //crear archivo
       crearArchivo(NOMBRE_ARCHIVO);
       
       //Escribir a archivo
       escribirArchivo(NOMBRE_ARCHIVO);
       
       //Leer archivo
       leerArchivo(NOMBRE_ARCHIVO);
       
       //Anexar archivo
       anexarArchivo(NOMBRE_ARCHIVO);
       
       //Leer archivo
       leerArchivo(NOMBRE_ARCHIVO);
    }
    
}
