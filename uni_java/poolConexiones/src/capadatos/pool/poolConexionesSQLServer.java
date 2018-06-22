package capadatos.pool;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class poolConexionesSQLServer {
    public static  DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        ds.setUrl("jdbc:sqlserver://LAPTOP-197OCJ1F:1433;database=javacurso;integratedSecurity=true;");
        //Definimos el tamaño del pool de conexiones
        ds.setInitialSize(5);        
        return ds;
    }
    
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
}
