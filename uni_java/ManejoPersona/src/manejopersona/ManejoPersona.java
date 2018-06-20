package manejopersona;

import datos.PersonasJDBC;
import domain.Persona;
import java.util.List;

public class ManejoPersona {
    public static void main(String[] args) {
       PersonasJDBC personasJDBC = new PersonasJDBC();
       
       //Insertando datos
       //personasJDBC.insert("Mabel", "De Jesus");
       
       //Actualizando datos
       //personasJDBC.update(5, "Rosita", "Pimentel");
       
       //Eliminando datos
       //personasJDBC.delete(3);
       
       //Mostrar datos
       List<Persona> personas = personasJDBC.select();
       for(Persona persona: personas){
           System.out.print(persona);
           System.out.println("");
       }
    }
    
}
