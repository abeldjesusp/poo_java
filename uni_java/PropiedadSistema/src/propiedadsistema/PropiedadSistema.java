/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propiedadsistema;
import java.util.*;
/**
 *
 * @author anyi
 */
public class PropiedadSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Properties propiedades = System.getProperties();
        
        Enumeration nombrePropiedades =  propiedades.propertyNames();
        
        while(nombrePropiedades.hasMoreElements()){
            String nombrePropiedad = (String) nombrePropiedades.nextElement();
            String valorPropiedad = propiedades.getProperty(nombrePropiedad);
            System.out.println("Llave : " + nombrePropiedad + " = " + valorPropiedad);
        }
    }
    
}
