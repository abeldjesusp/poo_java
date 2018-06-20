/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraentradadatos;

import java.util.*;
import static Calculadora.Operaciones.*;

/**
 *
 * @author anyi
 */
public class CalculadoraEntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor 1 : ");
        int a = scan.nextInt();
        System.out.println("Valor 2 : ");
        int b = scan.nextInt();
        int resultado = sumar(a,b);
        System.out.println("El resultado de la suma es : " + resultado);        
    }
    
}
