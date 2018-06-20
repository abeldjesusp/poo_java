/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadatos;

import java.io.*;
/**
 *
 * @author anyi
 */
public class EntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String captura;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bInput = new BufferedReader(input);
        
        try{
            System.out.println("Introduce un dato : ");
            captura = bInput.readLine();
            while(captura != null){
                System.out.println("Dato introducido : " + captura);
                captura = bInput.readLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
    }
    
}
