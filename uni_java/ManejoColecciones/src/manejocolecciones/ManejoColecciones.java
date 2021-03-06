/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocolecciones;

import java.util.*;
/**
 *
 * @author anyi
 */
public class ManejoColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List milista = new ArrayList();
        milista.add("1");
        milista.add("2");
        milista.add("3");
        milista.add("4");
        //Elemento repetido
        milista.add("4");
        imprimir(milista);

        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        //No permite elementos repetidos
        miSet.add("300");
        imprimir(miSet);
        
        Map miMapa = new HashMap();
        //Llave, valor
        miMapa.put("1","Juan");
        miMapa.put("2   ","Carlos");
        miMapa.put("3","Rosario");
        miMapa.put("4","Esperanza");
        //Se imprimen tadas las llaves
        imprimir(miMapa.keySet());
        //Se imprimen todos los valores
        imprimir(miMapa.values());

    }
    
    private static void imprimir(Collection coleccion){
        for(Object elemento : coleccion){
            System.out.print(elemento + " ");
        }
        System.out.println("");
    }    
}
