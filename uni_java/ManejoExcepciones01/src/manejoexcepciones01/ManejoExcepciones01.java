/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones01;

import domain.*;

/**
 *
 * @author anyi
 */
public class ManejoExcepciones01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Division division = new Division(10,0);
            division.devolverOperacion();
        }catch(OperationException oe){
            System.out.println("Ocurrio un error!!!");
            oe.printStackTrace();
        }
    }
    
}
