
package introduccionjdbc;

import java.sql.*;
//import com.microsoft.sqlserver.jdbc.*;

public class IntroduccionJDBC {    
    public static void main(String[] args) {
        String connectionString = 
                "jdbc:sqlserver://LAPTOP-197OCJ1F:1433;"
                + "database=Escuela;"
                + "integratedSecurity=true;";
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection =  DriverManager.getConnection(connectionString);
            Statement instruccion = connection.createStatement();
            String sql = "SELECT mat_alu, nom_alu, edad_alu FROM Alumnos;";
            ResultSet result = instruccion.executeQuery(sql);
            while(result.next()){
                System.out.print("Mat_Alu: " + result.getInt(1));
                System.out.print(" Nom_Alu: " + result.getString(2));
                System.out.println(" Edad_Alu: " + result.getString(3));
            }
            connection.close();
            instruccion.close();
            result.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
