package personas.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import personas.dto.PersonaDTO;

public class PersonaDaoJDBC implements iPersonaDao{
    private Connection userConn;
    private final String SQL_INSERT = "INSERT INTO persona(nombre,apellido) VALUES(?,?)";
    private final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=? WHERE id_persona=?";
    private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";
    private final String SQL_SELECT = "SELECT * FROM persona ORDER BY id_persona";

    public PersonaDaoJDBC() {
    }

    public PersonaDaoJDBC(Connection userConn) {
        this.userConn = userConn;
    }

    @Override
    public int insert(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try{
            conn = (userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;
            stmt.setString(index++, persona.getNombre());
            stmt.setString(index++, persona.getApellido());
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
    public int update(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try{
            conn = (userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, persona.getNombre());
            stmt.setString(index++, persona.getApellido());
            stmt.setInt(index, persona.getId_persona());
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
    public int delete(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try{
            conn = (userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getId_persona());
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
    public List<PersonaDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PersonaDTO personaDTO = null;
        List<PersonaDTO> personas = new ArrayList<PersonaDTO>();   
        
        try{
            conn = (userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idPersonaTemp = rs.getInt(1);
                String nombreTemp = rs.getString(2);
                String apellidoTemp = rs.getString(3);
                
                personaDTO = new PersonaDTO();
                personaDTO.setId_persona(idPersonaTemp);
                personaDTO.setNombre(nombreTemp);
                personaDTO.setApellido(apellidoTemp);
                personas.add(personaDTO);
            }
        }finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            if(this.userConn == null)
                Conexion.close(conn);
        }        
        return personas;
    }
}
