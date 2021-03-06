package datos;

import java.sql.*;

public class Conexion {
    private static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String CONNECTIONSTRING = "jdbc:sqlserver://LAPTOP-197OCJ1F:1433;"            
                + "database=javacurso;"
                + "integratedSecurity=true;";
    private static  Driver driver = null;
    
    public static synchronized Connection getConexion()throws SQLException{
        if(driver == null){
            try{
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            }catch(Exception e){
                System.out.println("Fallo en cargar el driver JDBC");
                e.printStackTrace();
            }
        }
        
        return DriverManager.getConnection(CONNECTIONSTRING);
    }
    
    public static void close(ResultSet rs){
        try{
            if(rs != null)
                rs.close();
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
    
    public static void close(PreparedStatement stmt){
        try{
            if(stmt != null)
                stmt.close();
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
    
    public static void close(Connection conn){
        try{
            if(conn != null)
                conn.close();
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
}
