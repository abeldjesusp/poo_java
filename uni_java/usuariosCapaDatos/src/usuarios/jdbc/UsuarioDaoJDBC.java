package usuarios.jdbc;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import usuarios.dto.UsuarioDTO;

public class UsuarioDaoJDBC implements iUsuarioDao{
    private Connection userConn = null;
    private final String SQL_INSERT = "INSERT INTO usuarios(usuario,usu_password) VALUES(?,?)";
    private final String SQL_UPDATE = "UPDATE usuarios SET usuario=?, usu_password=? WHERE id_usuario=?";
    private final String SQL_DELETE = "DELETE FROM usuarios WHERE id_usuario=?";
    private final String SQL_SELECT = "SELECT * FROM usuarios ORDER BY id_usuario";
    
    public UsuarioDaoJDBC(){}
    public UsuarioDaoJDBC(Connection conn){
        userConn = conn;
    }

    @Override
    public int insert(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try{
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int i = 1;
            stmt.setString(i++, usuario.getUsuario());
            stmt.setString(i++, usuario.getPassword());
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados : " + rows);
        }finally{
            Conexion.close(stmt);
            if(this.userConn == null)
                Conexion.close(conn);
        }
        
        return rows;
    }

    @Override
    public int update(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try{
            conn = (this.userConn != null) ? userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            int i = 1;
            stmt.setString(i++, usuario.getUsuario());
            stmt.setString(i++, usuario.getPassword());
            stmt.setInt(i, usuario.getId_usuario());            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados : " + rows);
        }finally{
            Conexion.close(stmt);
            if(this.userConn == null)
                Conexion.close(conn);
        }
        return rows;
    }

    @Override
    public int delete(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try{
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados : " + rows);
        }finally{
            Conexion.close(stmt);
            if(this.userConn == null)
                Conexion.close(conn);
        }
        return rows;
    }

    @Override
    public List<UsuarioDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        UsuarioDTO usuario = null;
        List<UsuarioDTO> usuarios = new ArrayList<UsuarioDTO>();
        
        try{
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idUsuarioTemp = rs.getInt(1);
                String usuarioTemp = rs.getString(2);
                String passwordTemp = rs.getString(3);
                usuario = new UsuarioDTO(idUsuarioTemp,usuarioTemp,passwordTemp);
                usuarios.add(usuario);
            }
        }finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            if(this.userConn == null)
                Conexion.close(conn);
        }
        return usuarios;
    }
    
    
}
