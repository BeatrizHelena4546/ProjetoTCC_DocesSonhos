package AcessoDadosDao;

import java.sql.*;

public class ModuloDbConect {
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dboneinfem304";
        String user = "dbuser304";
        String password = "Senha1";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }   catch (Exception e){
                System.out.println(e);
                return null;
        }
    }
    
}
