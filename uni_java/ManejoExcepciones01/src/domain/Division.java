/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author anyi
 */
public class Division {
    //Atributos de la clase
    private int numerador;
    private int denominador;
    
    public Division(int numerador, int denominador) throws OperationException{
        if(denominador == 0){
            //throw new IllegalArgumentException("Denominador igual a cero");
            throw new OperationException("Denominador igual a cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public void devolverOperacion(){
        System.out.println("El resultado de la division es : " + numerador / denominador);
    }
}
