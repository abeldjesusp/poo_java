package personas.test;

import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;
import personas.jdbc.iPersonaDao;
import personas.jdbc.PersonaDaoJDBC;

public class TestPersonas {

    public static void main(String[] args) {
        iPersonaDao personaDao = new PersonaDaoJDBC();
        
        PersonaDTO persona = new PersonaDTO();
        persona.setNombre("Mario");
        persona.setApellido("Bro");
        
        //Utilizamos la capa DAO para persistir el objeto DTO
        try{
            //Insertamos datos
           //personaDao.insert(persona);
            
            //Eliminamos registro
            //personaDao.delete(new PersonaDTO(5));
            
            //Actualizamos registro
            PersonaDTO personaTmp = new PersonaDTO();
//            personaTmp.setId_persona(4);//Actualizamos registro
//            personaTmp.setNombre("Luigi");
//            personaTmp.setApellido("Bross");
//            personaDao.update(personaTmp);

            //Mostramos registros
            List<PersonaDTO> personas = personaDao.select();
            for(PersonaDTO p : personas){
                System.out.println(p);
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
    
}
