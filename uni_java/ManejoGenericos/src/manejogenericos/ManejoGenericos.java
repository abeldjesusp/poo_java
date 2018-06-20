/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejogenericos;

/**
 *
 * @author anyi
 */
public class ManejoGenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer>(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoStr = new ClaseGenerica<>("Prueba");
        objetoStr.obtenerTipo();
        
        //Da error con los tipos primitivos
        //ClaseGenerica<int> primitivoInt = new ClaseGenerica<int>(88);
    }
    
}
