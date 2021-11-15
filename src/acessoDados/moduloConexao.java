package acessoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver;


/**
 *
 * @author Alunos
 */
public class moduloConexao {
    public static Connection connector;
    
         public static Connection connector(){
            java.sql.Connection conexao = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/bddocessonhos";
            String user = "accurate05_add1";
            String password = "Cedup2021";
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            
        }catch (Exception e){
            System.out.println(e); 
            return null;
        }
    }
}
