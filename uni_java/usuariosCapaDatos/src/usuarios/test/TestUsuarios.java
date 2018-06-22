package usuarios.test;

import java.sql.SQLException;
import java.util.List;
import usuarios.dto.UsuarioDTO;
import usuarios.jdbc.UsuarioDaoJDBC;
import usuarios.jdbc.iUsuarioDao;

public class TestUsuarios {

    public static void main(String[] args) {
       iUsuarioDao usuarioDao = new UsuarioDaoJDBC();
       
       UsuarioDTO usuarioDTO = new UsuarioDTO();
       usuarioDTO.setUsuario("mariobro");
       usuarioDTO.setPassword("0236jk");
       
       try{
           //Insertando datos
           //usuarioDao.insert(usuarioDTO);
           
           //Eliminamos registro
           //usuarioDao.delete(new UsuarioDTO(1));
           
           //Actualizar
           UsuarioDTO usuarioDTOUpdate = new UsuarioDTO(2, "kenshi","himura123");
           usuarioDao.update(usuarioDTOUpdate);
           
           
           //Mostrando datos
           List<UsuarioDTO> usuarios = usuarioDao.select();
           for(UsuarioDTO u : usuarios){
               System.out.println(u);
           }
       }catch(SQLException sqle){
           sqle.printStackTrace();
       }
       
    }    
}
