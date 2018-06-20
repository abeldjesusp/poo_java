package manejousuarios;

import datos.UsuariosJDBC;
import java.util.List;
import domain.Usuario;

public class ManejoUsuarios {

    public static void main(String[] args) {
        UsuariosJDBC userJDBC = new UsuariosJDBC();
        
        //Insertando datos
       // userJDBC.insert("batussai", "kaoru123");
       
       //Actualizar registros
       //userJDBC.update(1, "abeldjp", "6543210");
       
       //Borrar registro
       //userJDBC.delete(3);
       
       //Mostrar datos
       List<Usuario> usuarios = userJDBC.select();
       
       for(Usuario u : usuarios){
           System.out.print(u);
           System.out.println();
       }
       
    }
    
}
