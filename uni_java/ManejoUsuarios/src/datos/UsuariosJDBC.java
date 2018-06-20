package datos;

import domain.Usuario;
import java.sql.*;
import java.util.*;

public class UsuariosJDBC {
    private Connection userConn = null;
    private final String SQL_INSERT = "INSERT INTO usuarios(usuario,usu_password) VALUES(?,?)";
    private final String SQL_UPDATE = "UPDATE usuarios SET usuario=? ,usu_password=? WHERE id_usuario=?";
    private final String SQL_DELETE = "DELETE FROM usuarios WHERE id_usuario=?";
    private final String SQL_SELECT = "SELECT * FROM usuarios ORDER BY id_usuario";
    
    public int insert(String usuario, String password){
        PreparedStatement stmt = null;
        int rows = 0;
        
        try{
            userConn = Conexion.getConexion();
            stmt = userConn.prepareStatement(SQL_INSERT);
            int i = 1;
            stmt.setString(i++, usuario);
            stmt.setString(i++, password);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados : " + rows);
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(userConn);
        }
        
        return rows;        
    }
    
    public int update(int id_usuario, String usuario, String password){
        PreparedStatement stmt = null;
        int rows = 0;
        
        try{
            userConn = Conexion.getConexion();
            stmt = userConn.prepareStatement(SQL_UPDATE);
            int i = 1;
            stmt.setString(i++, usuario);
            stmt.setString(i++, password);
            stmt.setInt(i, id_usuario);
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados : " + rows);
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(userConn);
        }        
        return rows;
    }
    
    public int delete(int id_usuario){
        PreparedStatement stmt = null;
        int rows = 0;
        
        try{
            userConn = Conexion.getConexion();
            stmt = userConn.prepareStatement(SQL_DELETE);
            stmt.setInt(1,id_usuario);
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados : " + rows);
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }finally{
            Conexion.close(stmt);
            Conexion.close(userConn);
        }
        
        return rows;
    }
    
    public List<Usuario> select(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        
        try{
            userConn = Conexion.getConexion();
            stmt = userConn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int id_usuario = rs.getInt(1);
                String userName = rs.getString(2);
                String userPssw = rs.getString(3);  
                
                usuario = new Usuario();                
                usuario.setId_usuario(id_usuario);
                usuario.setUsuario(userName);
                usuario.setPassword(userPssw);
                
                usuarios.add(usuario);                
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(userConn);
        }        
        return usuarios;
    }
}
