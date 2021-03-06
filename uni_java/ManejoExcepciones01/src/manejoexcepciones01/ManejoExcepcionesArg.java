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
public class ManejoExcepcionesArg {
    public static void main(String args[]) throws OperationException{
        try{
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            Division div = new Division(op1, op2);
            div.devolverOperacion();
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.print("Ocurrio una excepcion: ");
            System.out.println("Hubo un error al acceder un elemento fuera de rango");
            aie.printStackTrace();
        }catch(NumberFormatException nfe){
            System.out.print("Ocurrio una excepcion: ");
            System.out.println("Uno de los argumentos no es entero");
            nfe.printStackTrace();
        }catch(OperationException oe){
            System.out.print("Ocurrio una excepcion: ");
            System.out.println("Se trato de realizar una operacion erronea");
            oe.printStackTrace();
        }finally{
            System.out.println("Se terminaron de revisar las excepciones");
        }
    }
}
