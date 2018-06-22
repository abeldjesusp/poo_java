package poolconexiones;

import capadatos.pool.poolConexionesSQLServer;
import java.sql.*;

public class TestPoolConexiones {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            conn = poolConexionesSQLServer.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM persona ORDER BY id_persona");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                System.out.print(" " + rs.getInt(1));
                System.out.print(" " + rs.getString(2));
                System.out.println(" " + rs.getString(3));
            }
            
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
            
    }
    
}
