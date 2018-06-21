package manejopersona;

import datos.Conexion;
import datos.PersonasJDBC;
import domain.Persona;
import java.util.List;
import java.sql.*;

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
       /*List<Persona> personas = personasJDBC.select();
       for(Persona persona: personas){
           System.out.print(persona);
           System.out.println("");
       }*/
       
       //Manejando transacciones
       Connection conn = null;
       
       try{
           conn = Conexion.getConnection();
           //Rivisamos si la conexion esta en modo autocommit
           //Por default es autocommit == true
           if(conn.getAutoCommit())
               conn.setAutoCommit(false);
           
           //Creamos objeto PersonaJDBC con le conexion creada
           PersonasJDBC personas = new PersonasJDBC(conn);
           
           //cambio correcto
           personas.update(2, "dfdfd", "fdfd");
           
           //Provocando error
           personas.insert("Pedro", 
                   "Salami1243567986597845613206457kriquwygfgfgfgfgfffgffgfgfgfgfgfgerhjgnthrutolimvndgwfetqyuahsgdvsjeueyhskadhjuhdjhjdjhdh");
           
           //Guardamos los cambios
           conn.commit();
       }catch(SQLException sqle){
           //Hacemos rollback en caso de error
           try{
               System.out.println("Entramos al rollback");
               //Imprimimos la excepcion a la consola
               sqle.printStackTrace(System.out);
               //Hacemos rollback
               conn.rollback();
           }catch(SQLException e){
               e.printStackTrace(System.out);
           }
       }
       
    }
    
}
